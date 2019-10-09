package ua.dmytrokashchenko.lesson10.example1;

public class Initialization {
    private static String msg(String msg) {
        System.out.println(msg);
        return msg;
    }
    public Initialization() {m = msg("1");}
    {m = msg("2");}
    String m = msg("3");

    public static void main(String[] args) {
        Object obj = new Initialization();
    }
}
