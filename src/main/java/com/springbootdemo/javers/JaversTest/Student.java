package com.springbootdemo.javers.JaversTest;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;
    List<String> favouriteSubject;
    Teacher teachers;
    List<Teacher> teacherList;

    public int getId() {
        return id;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFavouriteSubject() {
        return favouriteSubject;
    }

    public void setFavouriteSubject(List<String> favouriteSubject) {
        this.favouriteSubject = favouriteSubject;
    }

    public Teacher getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers = teachers;
    }
}
