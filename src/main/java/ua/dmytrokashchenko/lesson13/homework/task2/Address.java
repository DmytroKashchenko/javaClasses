package ua.dmytrokashchenko.lesson13.homework.task2;

public class Address {
    private String city;
    private String street;
    private int buildingNumber;

    public Address() {
    }

    public Address(String city, String street, int buildingNumber) {
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    @Override
    public String toString() {
        return "Address: City: " + city + ", Street: " + street + ", Building number: " + buildingNumber;
    }
}
