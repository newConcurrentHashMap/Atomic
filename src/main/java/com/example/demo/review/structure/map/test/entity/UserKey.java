package com.example.demo.review.structure.map.test.entity;

public class UserKey {


    public String name;

    public UserKey(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
