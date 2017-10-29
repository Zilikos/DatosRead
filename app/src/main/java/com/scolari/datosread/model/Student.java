package com.scolari.datosread.model;

/**
 * Created by zilikos on 29/10/17.
 */

public class Student {
    private String id;
    private String nambre;


    public Student() {
    }

    public Student(String id, String nambre) {
        this.id = id;
        this.nambre = nambre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNambre() {
        return nambre;
    }

    public void setNambre(String nambre) {
        this.nambre = nambre;
    }
}
