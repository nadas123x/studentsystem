package com.example.studentsystem.controller;

import java.util.List;

import com.example.studentsystem.model.Person;
import com.example.studentsystem.service.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PersonController
{
    @Autowired
    private PersonServices services;

    @GetMapping("/getall")
    public Iterable<Person>getPersons()
    {
        return services.listAll();
    }

    @PostMapping(value = "/save")
    private long saveBook(@RequestBody Person Persons)
    {
        services.saveOrUpdate(Persons);

        return  Persons.getId();
    }


    @RequestMapping("/Person/{id}")
    private Person getBooks(@PathVariable(name = "id") int Personid)
    {
        return services.getPersonById(Personid);
    }


    @PutMapping("/edit/{id}")

    private Person update(@RequestBody Person Persons)
    {
        services.saveOrUpdate(Persons);
        return Persons;
    }

    @DeleteMapping("/delete/{id}")
    private void deletePerson(@PathVariable("id") int id)
    {
        services.delete(id);
    }



}