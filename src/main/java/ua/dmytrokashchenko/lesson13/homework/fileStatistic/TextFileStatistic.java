package ua.dmytrokashchenko.lesson13.homework.fileStatistic;

import java.util.Map;

public interface TextFileStatistic {
    Map<Character, Integer> getFileStatistic(String fileName);
}
