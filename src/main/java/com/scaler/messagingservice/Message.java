package com.scaler.messagingservice;

public class Message {
    private final String sender;
    private final String receiver;
    private final String content;
    private final MessageType type;
    private final long timestamp;
    private final boolean isDelivered;



    Message(MessageBuilder builder) {
        this.sender = builder.sender;
        this.receiver = builder.receiver;
        this.content = builder.content;
        this.type = builder.type;
        this.timestamp = builder.timestamp;
        this.isDelivered = builder.isDelivered;
    }

    // Getters
    public String getSender() { return sender; }
    public String getReceiver() { return receiver; }
    public String getContent() { return content; }
    public MessageType getType() { return type; }
    public long getTimestamp() { return timestamp; }
    public boolean isDelivered() { return isDelivered; }


}
