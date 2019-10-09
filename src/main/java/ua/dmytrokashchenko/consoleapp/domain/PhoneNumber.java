package ua.dmytrokashchenko.consoleapp.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class PhoneNumber {

    private final String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
