package com.example.droidinside.recyclerviewexample.models;

/**
 * Created by Droidinside on 2/23/2017.
 */

public class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    String name;
}
