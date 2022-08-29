package com.example.studentsystem.service;

import com.example.studentsystem.model.Offre;

import java.util.List;

public interface IOffreService {

    List<Offre> find();
    Offre create(Offre offre);
    Offre update(Offre offre);
    void delete(Long id);

}
