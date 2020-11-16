package com.company;

public class Assignatura {
    private String name;
    private String[] nomAlumnes;

    public Assignatura(String name, String[] nomAlumnes) {
        this.name = name;
        this.nomAlumnes = nomAlumnes;
    }
    //getters

    public String getName() {
        return name;
    }
    public String[] getNomAlumnes () {
        return nomAlumnes;
    }
    //setters
    public void setName (String name) {
        this.name = name;
    }
    public void setNomAlumnes (String[] nomAlumnes) {
        this.nomAlumnes = nomAlumnes;
    }

}

