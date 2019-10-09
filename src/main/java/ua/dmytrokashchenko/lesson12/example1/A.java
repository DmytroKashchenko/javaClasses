package ua.dmytrokashchenko.lesson12.example1;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class A implements Comparable <A> {
    private int code;

    public A(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return getCode() == a.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    @Override
    public int compareTo(@NotNull A o) {
        return this.code - o.code;
    }
}
