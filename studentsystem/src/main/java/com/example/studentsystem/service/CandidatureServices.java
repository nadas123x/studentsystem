package com.example.studentsystem.service;

import com.example.studentsystem.model.Candidature;
import com.example.studentsystem.respository.CandidatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatureServices {

    @Autowired
    private CandidatureRepository repo;

    public Iterable<Candidature> listAll() {
        return this.repo.findAll();
    }

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Candidature candidatures)
    {
        repo.save(candidatures);
    }

    public Candidature getCandidatureById(long id)
    {
        return repo.findById(id).get();
    }


    public void update(Candidature candidatures, int id)
    {
        repo.save(candidatures);
    }

    public void delete(long id)
    {
        repo.deleteById(id);
    }

}