package ua.dmytrokashchenko.lesson6.t5.domain;

import java.util.Objects;

public class TextServiceImpl implements TextService {
    @Override
    public Text convertStringToText(String text) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public String convertTextToString(Text text) {
        return Objects.isNull(text) ? null : text.toString();
    }
}
