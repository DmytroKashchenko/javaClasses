package ua.dmytrokashchenko.lesson5.classes;

public class Car {
    private static final String CODE = "100";
    private static String staticString;
    private String name;
    private Engine engine;

//    public Car(String name, Engine engine) {
//        this.name = name;
//        this.engine = engine;
//    }

    public Car(String name, int volume, int code) {
        this.name = name;
        this.engine = new Engine(volume, code);
//        System.out.println(CODE_INNER);
        engine.innerMethod();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private void method() {
        System.out.println("Outer method");
    }

    public class Engine {
        private static final String CODE_INNER = "1000";
//        private static String innerStaticString; // не можна створювати статичні поля у вкладеному класі
        private final int volume;
        private final int code;

        public Engine(int volume, int code) {
            this.volume = volume;
            this.code = code;
            System.out.println(CODE);
            setName("Hello");
            method();
        }

        private void innerMethod(){
            System.out.println("Inner method");
        }
    }
}
