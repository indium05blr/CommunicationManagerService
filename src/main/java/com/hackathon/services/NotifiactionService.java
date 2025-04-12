package com.hackathon.services;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class NotifiactionService {
    public String name;
    public String mode;
    public String destination;
    public String msg;

    public NotifiactionService(String data) {

    }
}
