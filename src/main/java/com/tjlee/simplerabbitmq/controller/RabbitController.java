package com.tjlee.simplerabbitmq.controller;

import com.tjlee.simplerabbitmq.Send;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {

    @Autowired
    Send send;

    @RequestMapping("/send/{key}/{message}")
    public ResponseEntity send(@PathVariable String key, @PathVariable String message) throws Exception {
        send.send(key, message);
        return ResponseEntity.ok().body(null);
    }
}
