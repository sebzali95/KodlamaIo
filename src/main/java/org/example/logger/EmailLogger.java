package org.example.logger;

public class EmailLogger implements Logger{
    @Override
    public void log(String logMessage) {
        System.out.println("Logged into the Email : " + logMessage );
    }
}
