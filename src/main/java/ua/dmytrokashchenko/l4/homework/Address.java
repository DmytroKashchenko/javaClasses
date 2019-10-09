package ua.dmytrokashchenko.l4.homework;

public class Address {
    private String countryName;
    private String cityName;
    private String streetName;
    private int buildingNumber;
    private int postalCode;

    public Address(String countryName, String cityName, String streetName, int buildingNumber, int postalCode) {
        this.countryName = countryName;
        this.cityName = cityName;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
    }
}
