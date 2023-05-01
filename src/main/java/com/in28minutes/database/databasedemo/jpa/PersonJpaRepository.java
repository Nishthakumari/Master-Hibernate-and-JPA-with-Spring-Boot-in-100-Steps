package com.in28minutes.database.databasedemo.jpa;

import com.in28minutes.database.databasedemo.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PersonJpaRepository {

    @Autowired
    EntityManager entityManager;

    public Person findById(int id)
    {
        return entityManager.find(Person.class, id);
    }

    public Person update(Person person)
    {
        return entityManager.merge(person);
    }

    public Person insert(Person person)
    {
        return entityManager.merge(person);
    }

}
