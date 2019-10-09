package ua.dmytrokashchenko.consoleapp.domain;

public class Address {
    private final String countryName;
    private final String cityName;
    private final String streetName;
    private final int buildingNumber;
    private final int postalCode;

    public Address(String countryName, String cityName, String streetName, int buildingNumber, int postalCode) {
        this.countryName = countryName;
        this.cityName = cityName;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
    }

    private Address(Builder builder) {
        this.countryName = builder.countryName;
        this.cityName = builder.cityName;
        this.streetName = builder.streetName;
        this.buildingNumber = builder.buildingNumber;
        this.postalCode = builder.postalCode;
    }

    public static class Builder{
        private String countryName;
        private String cityName;
        private String streetName;
        private int buildingNumber;
        private int postalCode;

        public Builder() {
        }

        public Address build() {
            return new Address(this);
        }

        public Builder setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }

        public Builder setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setBuildingNumber(int buildingNumber) {
            this.buildingNumber = buildingNumber;
            return this;
        }

        public Builder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }
    }
}
