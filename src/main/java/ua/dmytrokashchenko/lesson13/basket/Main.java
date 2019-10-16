package ua.dmytrokashchenko.lesson13.basket;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Character[] characters = {'w', 'a', 'b', 'c', 'd', 'a', 'w', 'w', 'W'};
//        Stream<Character> stream = Arrays.stream(characters);
////        stream.collect(Collectors.groupingBy(character -> character, Collectors.counting()))
////                .forEach((character, count) -> System.out.println(character + ": " + count));
//        Map<Character, Long> map =
//                stream.collect(Collectors.groupingBy(character -> character, Collectors.counting()));
//        System.out.println(map);

//        Map<Character, Integer> characterToInteger = new HashMap<>();
//        stream.collect(Collectors.groupingBy(character -> character, Collectors.counting()))
//                .forEach((c, count) -> characterToInteger.put(c, count.intValue()));
//        System.out.println(characterToInteger);

//        try {
//            Files.lines(Paths.get("src\\main\\resources\\text.txt"))
//                    .collect(Collectors.groupingBy(character -> character, Collectors.counting()))
//                    .forEach((character, count) -> System.out.println(character + ": " + count));
//        } catch (IOException e) {
//            System.out.println("Such file not found");
//        }

        try {
            Files.lines(Paths.get("src\\main\\resources\\text.txt"))
                    .flatMapToInt(CharSequence::chars)
                    .mapToObj(x -> (Character) (char) x)
                    .collect(Collectors.groupingBy(character -> character, Collectors.counting()))
                    .forEach((character, count) -> System.out.println(character + ": " + count));
        } catch (IOException e) {
            System.out.println("Such file not found" + e.getMessage());
        }


    }
}
