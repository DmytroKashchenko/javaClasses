package ua.dmytrokashchenko.lesson13.homework.task1;

public class Main {
    public static void main(String[] args) {
        TextFileStatistic fileStatistic = new TextFileStatisticImpl();
        System.out.println(fileStatistic.getFileStatistic("src\\main\\resources\\text.txt"));
    }
}
