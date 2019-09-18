package ua.project.l2;

public enum lesson2 {
    Yellow("yellow"), Green("green"); // великі літери в неймінгу та в назві класу

    private String name;
    private int code;

    private  lesson2(String name) {
        this.name = name;
    }

    private  lesson2(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public void method() {
        System.out.println("1");
    }
}
