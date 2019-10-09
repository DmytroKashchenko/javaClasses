package ua.dmytrokashchenko.lesson10.homework;

public class Main {
    public static void main(String[] args) {
        MyList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("first element");
        myLinkedList.add("second element");
        String thirdElement = new String("third element");
        myLinkedList.add("third element");
        myLinkedList.add("fourth element");

        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.getByIndex(i));
        }
        System.out.println("size is " + myLinkedList.size());
        System.out.println(myLinkedList.getByIndex(3));
        System.out.println("-------------------------------------------------");
        System.out.println(myLinkedList.remove("fourth element"));
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.getByIndex(i));
        }
        myLinkedList.clean();
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.getByIndex(i));
        }
/*        System.out.println("-------------------------------------------------");
        System.out.println("size is " + myLinkedList.size());

        MyList<String> stringMyList = new MyArrayList<>();
        stringMyList.add("first element");
        stringMyList.add("second element");
        stringMyList.add("third element");
        stringMyList.add("fourth element");
        for (int i = 0; i < stringMyList.size(); i++) {
            System.out.println(stringMyList.getByIndex(i));
        }
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println(stringMyList.remove("fifth element"));
        for (int i = 0; i < stringMyList.size(); i++) {
            System.out.println(stringMyList.getByIndex(i));
        }*/
    }
}
