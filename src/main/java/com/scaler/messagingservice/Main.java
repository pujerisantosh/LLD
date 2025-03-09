package com.scaler.messagingservice;
import com.scaler.messagingservice.MessageBuilder;
public class Main {
    public static void main(String[] args) {

        Message message = new MessageBuilder()
                .setSender("Alice")
                .setReceiver("Bob")
                .setContent("Hello, Bob!")
                .setType(MessageType.TEXT)
                .setTimestamp(System.currentTimeMillis())
                .setDelivered(true)
                .build();

                System.out.println("Message from: " + message.getSender());
                System.out.println("Message to: " + message.getReceiver());
                System.out.println("Content: " + message.getContent());
                System.out.println("Type: " + message.getType());
                System.out.println("Timestamp: " + message.getTimestamp());
                System.out.println("Delivered: " + message.isDelivered());
            }
        }


