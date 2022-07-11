package com.example.studentsystem.service;

import java.util.List;

import com.example.studentsystem.model.Person;
import com.example.studentsystem.model.Student;
import com.example.studentsystem.respository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServices {

    @Autowired
    private PersonRepository repo;

    public Iterable<Person> listAll() {
        return this.repo.findAll();
    }

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Person persons)
    {
        repo.save(persons);
    }

    public Person getPersonById(long id)
    {
        return repo.findById(id).get();
    }


    public void update(Person persons, int id)
    {
        repo.save(persons);
    }

    public void delete(long id)
    {
        repo.deleteById(id);
    }

}