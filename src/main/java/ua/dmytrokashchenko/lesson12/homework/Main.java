package ua.dmytrokashchenko.lesson12.homework;


public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        Integer asd = 11;
        map.put(1, "Hello");
        map.put(3, "Word");
        map.put(asd, "Dmytro");
        System.out.println("Success!");
        System.out.println(map.getByKey(1));
        System.out.println(map.getByKey(4));
        System.out.println(map.getByKey(3));
        System.out.println(map.getByKey(asd));
        map.put(asd, "Dmytro");
        System.out.println(map.values());
        System.out.println(map.keys());

        System.out.println(map.getByKey(1));
        System.out.println(map.getByKey(3));
        System.out.println(map.getByKey(asd));
        System.out.println(map.values());
        System.out.println(map.keys());
        Integer someNumber = -1;
        System.out.println("hash code: " + someNumber.hashCode());
        String someString = "some string for hashcode";
        System.out.println("hash code for some string: " + someString.hashCode());

        MyMap<Integer, Integer> myHashMap = new MyHashMap<>();
        for (int i = -442; i < 1021; i++) {
            myHashMap.put(i, i * i);
        }
        System.out.println(myHashMap.size());

    }
}
