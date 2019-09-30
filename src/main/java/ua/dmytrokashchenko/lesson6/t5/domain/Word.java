package ua.dmytrokashchenko.lesson6.t5;

import java.util.List;

public class Word {
    private final List<Symbol> symbols;

    public Word(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }
}
