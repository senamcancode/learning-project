package org.example.singleton_pattern;

public class Eager_Singleton {
    private volatile static Eager_Singleton eagerSingleton = new Eager_Singleton();

    private Eager_Singleton() {
    }
    

    public static Eager_Singleton getInstance() {
        return eagerSingleton;
    }

}
