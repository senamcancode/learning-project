package org.example.singleton_pattern;

public class Logger {
    private volatile static Logger logger;

    private Logger () {}

    public static Logger getLoggerInstance() {
        if (logger == null ){
            synchronized (Logger.class){
                if (logger == null){
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void printingExample() {
        System.out.println("This is a test to show the instance is exatly the same");
    }
}
