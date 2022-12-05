package org.example;

import org.example.model.Cat;
import org.example.model.Owner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class JpaRead {
    public static void main(String[] args) {
        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // get owner data using primary key id=1
        Owner owner = null;          //UPDATE THIS LINE
        // print the owner data
        System.out.println(owner);   //Owner{id=1, name='Jia'}

        // get the owner's cats
        List<Cat> cats = null;       //UPDATE THIS LINE
        // print the owner's cats
        System.out.println(cats);  //[Cat{id=4, name='Meowie', age=5, breed='Tabby'}, Cat{id=5, name='Whiskers', age=1, breed='Birman'}]

        // close entity manager and factory
        entityManager.close();
        entityManagerFactory.close();
    }
}
