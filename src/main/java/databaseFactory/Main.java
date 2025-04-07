package databaseFactory;

public class Main {
    public static void main(String[] args) {
        // Creating MySQL Database connection using the factory
        Database mysqlDatabase = DatabaseFactory.createDatabase(DatabaseType.MYSQL, "my_mysql_db");
        System.out.println("Database Type: " + mysqlDatabase.supportsType());
        mysqlDatabase.databaseConnection();

        // Creating PostgreSQL Database connection using the factory
        Database postgresDatabase = DatabaseFactory.createDatabase(DatabaseType.POSTGRE_SQL, "my_postgres_db");
        System.out.println("Database Type: " + postgresDatabase.supportsType());
        postgresDatabase.databaseConnection();

        // Creating MongoDB Database connection using the factory
        Database mongoDatabase = DatabaseFactory.createDatabase(DatabaseType.MONGO_DB, "my_mongo_db");
        System.out.println("Database Type: " + mongoDatabase.supportsType());
        mongoDatabase.databaseConnection();
    }
}


