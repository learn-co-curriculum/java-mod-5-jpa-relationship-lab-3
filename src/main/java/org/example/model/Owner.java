package org.example.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Owner {

    private int id;

    private String name;

    private List<Cat> cats = new ArrayList<>();

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

    public List<Cat> getCats() {
        return cats;
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
