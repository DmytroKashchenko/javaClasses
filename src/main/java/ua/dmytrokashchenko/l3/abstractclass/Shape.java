package ua.dmytrokashchenko.l3.abstractclass;

public abstract class Shape {

    private String name;

    public Shape(String name) {
//        System.out.println("Shape");
        this.name = name;
    }

    public abstract int getPerimeter();

}
