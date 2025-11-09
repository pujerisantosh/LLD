package singletonloggerservice;

public class LoggerService {

    private static LoggerService instance;


    private LoggerService(){
        System.out.println("LoggerService initialized...");
    }

    public static LoggerService getInstance() {
        if (instance == null) {
            synchronized (LoggerService.class) {

                if (instance == null) {
                    instance = new LoggerService();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println("[LOG] " + message);

    }


}
