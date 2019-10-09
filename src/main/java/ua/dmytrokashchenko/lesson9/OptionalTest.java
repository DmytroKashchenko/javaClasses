package ua.dmytrokashchenko.lesson9;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        Optional<String> name1 = Optional.ofNullable("Dmytro");
        name.ifPresent(var -> System.out.println(name.get()));
        name1.ifPresent(var -> System.out.println(name1.get()));
        if (name1.isPresent()) System.out.println("isPresent");
        System.out.println(name.map(String::toString).orElse("Empty") + " name");
        System.out.println(name1.map(String::toString).orElse("Empty") + " name");
        System.out.println(name1.get() + " name1");
        System.out.println(name1.orElseGet(()->"Empty value"));
    }
}
