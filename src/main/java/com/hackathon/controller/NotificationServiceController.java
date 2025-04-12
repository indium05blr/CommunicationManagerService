package com.hackathon.controller;

import com.hackathon.services.NotifiactionService;
import com.hackathon.services.NotificationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/notificationService")
public class NotificationServiceController {
    @Autowired
    private NotifiactionService notifiactionService;
    @Autowired
    private NotificationServiceImpl notificationServiceImpl;


    @PostMapping("/mailing")
    public ResponseEntity<String> doMailing(@RequestBody NotifiactionService notifiactionService) {
       // notificationServiceImpl.sendMail(mail);
        return null;
    }
}