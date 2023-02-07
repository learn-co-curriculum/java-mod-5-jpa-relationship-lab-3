package org.example.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Cat {

    private int id;

    private String name;

    private int age;

    private String breed;

    private List<Owner> owners = new ArrayList<>();

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void addOwner(Owner owner) {
        owners.add(owner);
        owner.addCat(this);  //Owner is on owning side of relationship
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}