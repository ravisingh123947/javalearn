package com.springbootdemo.stream;

import java.util.List;

public class EmployeePhoneNumberDetail {
    int id ;
    List<String> phoneNumber;

    public EmployeePhoneNumberDetail(int id, List<String> phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "EmployeePhoneNumberDetail{" +
                "id=" + id +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
