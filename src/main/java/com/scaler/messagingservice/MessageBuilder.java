package com.scaler.messagingservice;

public class MessageBuilder {
    String sender;
    String receiver;
    String content;
    MessageType type;
    long timestamp;
    boolean isDelivered;

    public MessageBuilder(String sender, String receiver, String content, MessageType type, long timestamp, boolean isDelivered) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.type = type;
        this.timestamp = timestamp;
        this.isDelivered = isDelivered;
    }

    public MessageBuilder() {

    }

    public MessageBuilder setSender(String sender) {
        this.sender = sender;
        return this;
    }

    public MessageBuilder setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    public MessageBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public MessageBuilder setType(MessageType type) {
        this.type = type;
        return this;
    }

    public MessageBuilder setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public MessageBuilder setDelivered(boolean isDelivered) {
        this.isDelivered = isDelivered;
        return this;
    }

    public Message build() {
        return new Message(this);
    }
}


