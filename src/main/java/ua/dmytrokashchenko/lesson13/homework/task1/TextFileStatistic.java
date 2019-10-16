package ua.dmytrokashchenko.lesson13.homework.task1;

import java.util.Map;

public interface TextFileStatistic {
    Map<Character, Integer> getFileStatistic(String fileName);
}
