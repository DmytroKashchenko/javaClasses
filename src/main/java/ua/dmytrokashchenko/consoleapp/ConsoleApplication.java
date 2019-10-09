package ua.dmytrokashchenko.consoleapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsoleApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("app-context-annotation.xml");
        context.refresh();
        Menu menu = context.getBean("menu", Menu.class);
        menu.run();
    }
}
