package ua.dmytrokashchenko.lesson6.t5.domain;

import java.util.LinkedList;
import java.util.List;

public class Word {
    private final List<Symbol> symbols;

    public Word(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public Word(String string) {
        symbols = new LinkedList<Symbol>();
        if (string != null) {
            for (int i = 0; i < string.length(); i++) {
                Symbol symbol = new Symbol(string.charAt(i));
                symbols.add(symbol);
            }
        }
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        char[] charsOfWord = new char[symbols.size()];
        for (int i = 0; i < symbols.size(); i++) {
            charsOfWord[i] = symbols.get(i).getSymbol();
        }
        return String.valueOf(charsOfWord);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;

        Word word = (Word) o;

        return getSymbols() != null ? getSymbols().equals(word.getSymbols()) : word.getSymbols() == null;
    }

    @Override
    public int hashCode() {
        return getSymbols() != null ? getSymbols().hashCode() : 0;
    }
}
