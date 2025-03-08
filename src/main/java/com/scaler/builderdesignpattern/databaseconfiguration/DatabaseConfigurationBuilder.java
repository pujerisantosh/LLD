package com.scaler.builderdesignpattern.databaseconfiguration;


public class DatabaseConfigurationBuilder {
    String databaseUrl;
    String username;
    String password;
    int maxConnections;
    boolean enableCache;
    boolean isReadOnly;

    public DatabaseConfigurationBuilder databaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
        return this;
    }

    public DatabaseConfigurationBuilder username(String username) {
        this.username = username;
        return this;
    }

    public DatabaseConfigurationBuilder password(String password) {
        this.password = password;
        return this;
    }

    public DatabaseConfigurationBuilder maxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    public DatabaseConfigurationBuilder enableCache(boolean enableCache) {
        this.enableCache = enableCache;
        return this;
    }

    public DatabaseConfigurationBuilder readOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
        return this;
    }

    public DatabaseConfiguration build() {
        return new DatabaseConfiguration(this);
    }


}
