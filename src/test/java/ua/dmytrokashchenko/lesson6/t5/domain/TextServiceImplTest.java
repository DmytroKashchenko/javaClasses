package ua.dmytrokashchenko.lesson6.t5.domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TextServiceImplTest {

    private TextServiceImpl textService = new TextServiceImpl();

    @Test
    public void shouldReturnNullStringForNullText() {
        String expectedResult = null;
        String actualResult = textService.convertTextToString(null);
//        assertEquals(expectedResult, actualResult);
        assertNull("", actualResult);
    }

/*    @Test
    public void shouldReturnNotNullStringForText() {
        String expectedResult = "Hello";
        List<Symbol> symbols = asList(new Letter('H'), new Letter(e));
//        Text text = new Text(new Sentence(Arrays.asList(new Word(Arrays.asList(new Letter('e') {
//        })))));
        Sentence header = new Sentence(null);
        Text text = new Text(header, null);
        String actualResult = textService.convertTextToString(new Text(new Sentence()"Hello word"));
        assertEquals(expectedResult, actualResult);
    }*/


    @Test
    public void convertStringToText() {
    }

    @Test
    public void convertTextToString() {
    }
}