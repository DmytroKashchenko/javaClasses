package ua.dmytrokashchenko.lesson6.t5;

import ua.dmytrokashchenko.lesson6.t5.domain.Word;

public class ConsoleApplication {
    public static void main(String[] args) {
        Word word = new Word("Hello");
        Word word1 = new Word("Hello");
        System.out.println(word.equals(word1));
        System.out.println(word.hashCode() + " " + word1.hashCode());
        System.out.println(word);
    }
}
