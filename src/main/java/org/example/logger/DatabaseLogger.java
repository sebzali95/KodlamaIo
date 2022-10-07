package org.example.logger;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String logMessage) {
        System.out.println("Logged into the database : " + logMessage );
    }
}
