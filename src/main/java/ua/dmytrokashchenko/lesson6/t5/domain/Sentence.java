package ua.dmytrokashchenko.lesson6.t5.domain;

import java.util.LinkedList;
import java.util.List;

public class Sentence {
    private final List<Word> words;

    public Sentence(List<Word> words) {
        this.words = words;
    }
    public Sentence(String str) {
        words = new LinkedList<Word>();
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() { // доробити
        StringBuilder str = new StringBuilder();
        for (Word word : words) {
            str.append(word.toString());
        }
        return str.toString();
    }
}
