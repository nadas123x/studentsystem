package com.example.studentsystem.controller;

import com.example.studentsystem.model.Candidature;
import com.example.studentsystem.service.CandidatureServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CandidatureController
{
    @Autowired
    private CandidatureServices services;

    @GetMapping("/getallcandidature")
    public Iterable<Candidature>getCandidatures()
    {
        return services.listAll();
    }

    @PostMapping(value = "/savecandidature")
    private long saveBook(@RequestBody Candidature Candidatures)
    {
        services.saveOrUpdate(Candidatures);

        return  Candidatures.getId();
    }


    @RequestMapping("/Candidature/{id}")
    private Candidature getBooks(@PathVariable(name = "id") int Candidatureid)
    {
        return services.getCandidatureById(Candidatureid);
    }


    @PutMapping("/editcandidature/{id}")

    private Candidature update(@RequestBody Candidature Candidatures)
    {
        services.saveOrUpdate(Candidatures);
        return Candidatures;
    }

    @DeleteMapping("/deletecandidature/{id}")
    private void deleteCandidature(@PathVariable("id") int id)
    {
        services.delete(id);
    }



}