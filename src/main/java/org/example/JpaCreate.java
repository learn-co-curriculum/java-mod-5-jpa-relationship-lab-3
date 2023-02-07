package org.example;

import org.example.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaCreate {
    public static void main(String[] args) {
        // create owners
        Owner owner1 = new Owner();
        owner1.setName("Jia");
        Owner owner2 = new Owner();
        owner2.setName("Yuri");
        Owner owner3 = new Owner();
        owner3.setName("Luka");

        // create cats
        Cat cat1 = new Cat();
        cat1.setName("Meowie");
        cat1.setAge(5);
        cat1.setBreed("Tabby");
        Cat cat2 = new Cat();
        cat2.setName("Whiskers");
        cat2.setAge(1);
        cat2.setBreed("Birman");
        Cat cat3 = new Cat();
        cat3.setName("Freddy Purrcury");
        cat3.setAge(10);
        cat3.setBreed("American Shorthair");

        // create owner <> cat associations
        // ADD YOUR CODE HERE



        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // access transaction object
        EntityTransaction transaction = entityManager.getTransaction();

        // create and use transactions
        transaction.begin();

        //persist the owners
        entityManager.persist(owner1);
        entityManager.persist(owner2);
        entityManager.persist(owner3);

        //persist the cats
        entityManager.persist(cat1);
        entityManager.persist(cat2);
        entityManager.persist(cat3);

        transaction.commit();

        //close entity manager and factory
        entityManager.close();
        entityManagerFactory.close();
    }
}
