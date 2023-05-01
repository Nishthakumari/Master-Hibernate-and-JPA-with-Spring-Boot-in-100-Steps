package com.in28minutes.database.databasedemo.jpa;

import com.in28minutes.database.databasedemo.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class PersonJpaRepository {

    @Autowired
    EntityManager entityManager;

    public List<Person> findAll(){
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
        return namedQuery.getResultList();
    }

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

    public void deleteById(int id)
    {
        Person person = findById(id);
         entityManager.remove(person);
    }

}
