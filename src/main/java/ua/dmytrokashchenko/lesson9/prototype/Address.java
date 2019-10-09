package ua.dmytrokashchenko.lesson9.prototype;

public class Address implements Cloneable {
    private String city;
    private int code;

    public Address() {
    }

    public Address(String city, int code) {
        this.city = city;
        this.code = code;
    }

    public Address(Address target) {
        this.city = target.city;
        this.code = target.code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return city + " " + code;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}
