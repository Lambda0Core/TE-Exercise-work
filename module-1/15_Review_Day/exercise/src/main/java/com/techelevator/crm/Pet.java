package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    //properties
    private String name;
    private String species;
    private List<String> Vaccinations = new ArrayList<String>();

    //constructor
    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return Vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.Vaccinations = vaccinations;
    }

    //method
    public String listVaccinations() {
        String vacList = "";
        for (int i = 0; i < Vaccinations.size(); i++) {
            vacList += Vaccinations.get(i);
            if (i != Vaccinations.size() - 1) {
                vacList += ", ";
            }

        }
        return vacList;
    }
}

