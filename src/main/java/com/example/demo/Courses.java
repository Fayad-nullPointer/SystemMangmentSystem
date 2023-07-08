package com.example.demo;

public class Courses {
    private String Coursename,Coursecode,Coursetitle;

    public Courses(String coursename, String coursecode, String coursetitle) {
        this.Coursename = coursename;
        this.Coursecode = coursecode;
        this.Coursetitle = coursetitle;

    }

    public void setCoursename(String Coursename) {
        this.Coursename = Coursename;
    }

    public void setCoursecode(String Coursetode) {
        this.Coursecode = Coursecode;
    }

    public void setCoursetitle(String Coursetitle) {
        this.Coursetitle = Coursetitle;
    }

    public String getCoursename() {
        return Coursename;
    }

    public String getCoursecode() {
        return Coursecode;
    }

    public String getCoursetitle() {
        return Coursetitle;
    }

}
