package com.scaler.builderdesignpattern.databaseconfiguration;

public class Main {
    public static void main(String[] args) {
        DatabaseConfiguration config = new DatabaseConfiguration.Builder()
                .url("jdbc:mysql://localhost:3306/mydb")
                .username("admin")
                .password("secret")
                .maxConnections(10)
                .enableCache(true)
                .isReadOnly(false)
                .build();

        System.out.println("Database URL: " + config.getUrl());
        System.out.println("Username: " + config.getUsername());
        System.out.println("Max Connections: " + config.getMaxConnections());
        System.out.println("Enable Cache: " + config.isEnableCache());
        System.out.println("Read Only: " + config.isReadOnly());
    }
}

