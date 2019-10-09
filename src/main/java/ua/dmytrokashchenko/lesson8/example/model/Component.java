package ua.dmytrokashchenko.lesson8.example.model;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})

public @interface Component {

}

enum Life{
    SINGLETON, PROVIDER
}
