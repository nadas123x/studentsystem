package com.example.studentsystem.service;

import com.example.studentsystem.model.Offre;
import com.example.studentsystem.respository.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreService implements IOffreService {

    @Autowired
    private OffreRepository repository;

    @Override
    public List<Offre> find() {
        return repository.findAllByOrderByIdAsc();
    }


    @Override
    public Offre create(Offre offre) {
        return repository.save(offre);

    }

    @Override
    public Offre update(Offre offre) {
        return repository.save(offre);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}