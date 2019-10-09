package ua.dmytrokashchenko.lesson12.example1;

import java.util.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        Set<A> items = new TreeSet<>();
        A a = new A(1);
        A a1 = new A(100);
        items.add(a);
        System.out.println(items.size());
//        items.add(a1);
//        System.out.println(items.size());

        boolean isContained = items.contains(a1);
        a.setCode(100);


        System.out.println(isContained);

        Comparator<A> comparator = (o1, o2) -> - o1.getCode() + o2.getCode();

        Set<A> items1 = new TreeSet<>(comparator);

        Set<String> strings = new LinkedHashSet<>();
        strings.add("hello");
        strings.add("word");
        System.out.println(strings);

        Map<String, String> emailToPassword = new HashMap<>();
        emailToPassword.put("Key1", "Value1");
        emailToPassword.put("Key2", "Value2");
        Set<Map.Entry<String, String>> entries = emailToPassword.entrySet();
        Set<String> strings1 = emailToPassword.keySet();
        Collection<String> values = emailToPassword.values();
        emailToPassword.forEach((key, value) -> System.out.println("key: " + key + "value: " + value));


        Map<Character, Integer> someValue = method("Hello W word");
        System.out.println(someValue);

    }

    public static Map<Character, Integer> method(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = sentence.toCharArray();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                Integer counter = map.get(aChar);
                map.put(aChar, ++counter);
            } else {
                map.put(aChar, 1);
            }
        }
        return map;
    }

    public static Map<Character, Integer> methodMerge(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = sentence.toCharArray();
        for (char aChar:chars){
            map.merge(aChar, 1, (oldCounter, counter) -> ++oldCounter );
        }
        return map;
    }

}
