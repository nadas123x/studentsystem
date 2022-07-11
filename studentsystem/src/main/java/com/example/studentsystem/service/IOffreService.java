package com.example.studentsystem.service;

import com.example.studentsystem.model.Offre;

import java.util.List;

public interface IOffreService {

    List<Offre> find();
    Offre create(Offre offre);
    Offre update(Long id, int quantity);
    void delete(Long id);

}
