package ua.dmytrokashchenko.l2;

public final class User1 {
    private final Address address;
    private final String name;

    public User1(String city, int code, String name) {
        address = new Address(city, code);
        this.name = name;
    }
    public User1(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address.getCity() + " " + address.getCode();
    }

    public String getName() {
        return name;
    }
}
