package com.oops;

class student3 {


    private int id;      // data hiding
    private String name;

    public int getId() {
        return id;
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
}

public class encapsulation {
    public static void main(String[] args) {
        student3 s = new student3();
        s.setId(101);
        s.setName("Neha");

        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
