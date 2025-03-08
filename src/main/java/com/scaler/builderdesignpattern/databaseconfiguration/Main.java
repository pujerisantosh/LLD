package com.scaler.builderdesignpattern.databaseconfiguration;

public class Main {
    public static void main(String[] args) {
        // Using the builder to create a database configuration
        DatabaseConfiguration config = DatabaseConfiguration.builder()
                .databaseUrl("jdbc:mysql://localhost:3306/mydb")
                .username("admin")
                .password("securePass")
                .maxConnections(20)
                .enableCache(true)
                .readOnly(false)
                .build();

        // Print the configuration
        System.out.println(config);
    }
}

