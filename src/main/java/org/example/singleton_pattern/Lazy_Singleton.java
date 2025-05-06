package org.example.singleton_pattern;

public class Lazy_Singleton {
    private static volatile Lazy_Singleton instance;

    private Lazy_Singleton() {}

    public static Lazy_Singleton getInstance() {
        if(instance == null){
            synchronized (Lazy_Singleton.class){
                if(instance == null){
                    instance = new Lazy_Singleton();
                }
            }
        }
        return instance;
    }
}
