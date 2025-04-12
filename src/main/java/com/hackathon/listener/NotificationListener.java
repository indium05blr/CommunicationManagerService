package com.hackathon.listener;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hackathon.services.NotifiactionService;
import com.hackathon.services.NotificationServiceImpl;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


public class NotificationListener {
    @Autowired
    private NotificationServiceImpl notificationServiceImpl;
    @Autowired
    private JavaMailSender javaMailSender;

    @KafkaListener(id="foo", topics = "team2")
    public void listen(String data){
//take that json and convert in pojo
        // then write main logic

        try {
            JSONObject message = new JSONObject(data);
            String to = message.getString("email");
            String subject = message.getString("subject");
            String body = message.getString("body");

            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setTo(to);
            simpleMailMessage.setSubject(subject);
            simpleMailMessage.setText(body);
            javaMailSender.send(simpleMailMessage);

        }
        catch (Exception e){
            System.out.printf("error", e);
        }
    }

}
