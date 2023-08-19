package ru.samokat.data;

import ru.samokat.objects.CourierObject;

public class CourierData {
    private final String login;
    private final String password;

    public CourierData(String login, String password) {
        this.login = login;
        this.password = password;
    }


    public static CourierData getCourierData(CourierObject courierObject) {
        return new CourierData(courierObject.getLogin(), courierObject.getPassword());
    }
}