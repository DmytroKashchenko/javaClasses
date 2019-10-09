package ua.dmytrokashchenko.lesson10;

public class Main {
    public static void main(String[] args) {
        Container container1 = new Container("String");
        Container container2 = new Container(1);

        Object object1 = container1.getObject();

        if (object1 instanceof String) {
            String strObject = (String) object1;
        }

        Object object2 = container2.getObject();

        GenericContainer<String> stringGenericContainer = new GenericContainer<>("String");
        GenericContainer<Integer> integerGenericContainer = new GenericContainer<>(1);
        String object = stringGenericContainer.getObject();

        // яка різниця, чи є вона? в док джава
        GenericContainer<Object> genericContainer1 = new GenericContainer<>();
        GenericContainer genericContainer2 = new GenericContainer();
        //
        System.out.println(stringGenericContainer.getClass() == integerGenericContainer.getClass()); // true

//        GenericContainer<Number> numberGenericContainer = new GenericContainer<Integer>(1);

        
    }
}
