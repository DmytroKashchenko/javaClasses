package ua.dmytrokashchenko.lesson7.exemple2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Singleton singleton1 = Singleton.SINGLETON;
        Singleton singleton2 = Singleton.SINGLETON;
        Singleton singleton3 = new Singleton();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1 == singleton3);
//        singleton1.method();

        Class<Singleton> singletonClass = Singleton.class;
        Method method = singletonClass.getDeclaredMethod("notStaticMethod");
        method.setAccessible(true);
        System.out.println(method.getName());
        Object invoke = method.invoke(singleton1);

//        Class<Singleton> singletonClass1 = Singleton.class;
//        Method method1 = singletonClass.getDeclaredMethod("notStaticMethod", int.class);
//        method.setAccessible(true);
//        System.out.println(method1.getName());
//        Object invoke1 = method1.invoke(singleton1, 1);

        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton singleton = declaredConstructor.newInstance();
        System.out.println(singleton == singleton1);

    }
}

class Singleton {
    public static final Singleton SINGLETON = new Singleton();
//    private Singleton() {
//    }
    public Singleton() {

    }

    private void notStaticMethod() {
        System.out.println("hello");
    }

    private void notStaticMethod(int code) {
        System.out.println("Hello " + code);
    }



}
