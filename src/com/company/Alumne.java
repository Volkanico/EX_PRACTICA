package com.company;

public class Alumne {
    private String name;
    private int yearsold;
    private int id;
    private int notes [];
//constructor
    public Alumne (String name, int yearsold, int id, int notes []) {
        this.name = name;
        this.yearsold = yearsold;
        this.id = id;
        this.notes = notes;

    }
//getters
    public String getName() {
        return name;
    }
    public int getYearsold() {
        return yearsold;
    }
    public int getId() {
        return id;
    }
    public int[] getNotes() {
        return notes;
    }
//setters

    public void setName(String name) {
        this.name = name;
    }

    public void setYearsold(int yearsold) {
        this.yearsold = yearsold;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNotes(int[] notes) {
        this.notes = notes;
    }
}
