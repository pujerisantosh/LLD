package databaseFactory;

public class MongoDBDatabase extends Database {
    private String databaseName;
    public MongoDBDatabase(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void databaseConnection() {
        //Implement the logic to connect MongoDB Database
        System.out.println("Connecting to MongoDB Database");
    }

    public DatabaseType supportsType() {
        return DatabaseType.MONGO_DB;
    }
}
