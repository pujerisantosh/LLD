package com.scaler.builderdesignpattern.databaseconfiguration;


public final class DatabaseConfiguration {
    private final String databaseUrl;
    private final String username;
    private final String password;
    private final int maxConnections;
    private final boolean enableCache;
    private final boolean isReadOnly;

    // Private constructor to enforce use of Builder
    DatabaseConfiguration(DatabaseConfigurationBuilder builder) {
        this.databaseUrl = builder.databaseUrl;
        this.username = builder.username;
        this.password = builder.password;
        this.maxConnections = builder.maxConnections;
        this.enableCache = builder.enableCache;
        this.isReadOnly = builder.isReadOnly;
    }

    // Getters
    public String getDatabaseUrl() { return databaseUrl; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public int getMaxConnections() { return maxConnections; }
    public boolean isCacheEnabled() { return enableCache; }
    public boolean isReadOnly() { return isReadOnly; }

    // Static method to get Builder instance
    public static DatabaseConfigurationBuilder builder() {
        return new DatabaseConfigurationBuilder();
    }

    @Override
    public String toString() {
        return "DatabaseConfiguration{" +
                "databaseUrl='" + databaseUrl + '\'' +
                ", username='" + username + '\'' +
                ", maxConnections=" + maxConnections +
                ", enableCache=" + enableCache +
                ", isReadOnly=" + isReadOnly +
                '}';
}

}