package ua.dmytrokashchenko.lesson6.t5.domain;

public class Symbol {
    private final char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(getSymbol());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Symbol)) {
            return false;
        }

        Symbol symbol1 = (Symbol) o;

        return getSymbol() == symbol1.getSymbol();
    }

    @Override
    public int hashCode() {
        return getSymbol();
    }
}
