package ua.dmytrokashchenko.lesson13.homework.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class TextFileStatisticImpl implements TextFileStatistic {
    @Override
    public Map<Character, Integer> getFileStatistic(String fileName) {
        Map<Character, Integer> characterToInteger = new HashMap<>();
        try {
            Files.lines(Paths.get(fileName))
                    .flatMapToInt(CharSequence::chars)
                    .mapToObj(x -> (Character) (char) x)
                    .collect(Collectors.groupingBy(character -> character, Collectors.counting()))
                    .forEach((characterKey, count) -> characterToInteger.put(characterKey, count.intValue()));
        } catch (IOException e) {
            System.out.println("Such file not found" + e.getMessage());
        }
        return characterToInteger;
    }
}
