package ua.dmytrokashchenko.l3.singleton;

public class SingletonLazy {
    private static SingletonLazy instance;
    public SingletonLazy() {

    }
// singlton
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
