package com.example;

public class Person {
    private String firstame;
    private String lastname;

   
    public Person(String lastname, String firstame) {
        this.lastname = lastname;
        this.firstame = firstame;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstame() {
        return firstame;
    }

    public void setFirstame(String firstame) {
        this.firstame = firstame;
    }

}
