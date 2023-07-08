package com.example.demo;

public class Student {
    private int Id;
    private String firstName,secondName,major,minor;
    private double GPA;

    public Student(int id, String firstName, String secondName, String major,String minor, double GPA) {
        this.Id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.major = major;
        this.minor = minor;
        this.GPA = GPA;
    }

    public Student(int ac, String string, String string2, String string1) {
        Id=ac;
        firstName= string;
        major=string2;
        minor=string1;
    }

//    public Student(long anInt, String string, double aDouble, String string1) {
//
//    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirsName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
