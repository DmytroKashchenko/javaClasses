package ua.dmytrokashchenko.l3.anonim;

public class Main {
    public static void main(String[] args) {
        AI ai = new AI() {
            @Override
            public int method() {
                return 0;
                // лише в цьому місці реалізація
            }
        };
        MyClass myClass = new MyClass() {
            @Override
            public void hello() {
                System.out.println("Hi");
            }
        };
        myClass.hello();

    }
}
