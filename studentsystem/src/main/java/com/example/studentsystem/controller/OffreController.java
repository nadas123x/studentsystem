package com.example.studentsystem.controller;

import com.example.studentsystem.model.Offre;
import com.example.studentsystem.respository.OffreRepository;
import com.example.studentsystem.service.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OffreController {

    @Autowired
    private OffreService service;
    private OffreRepository offreRepository;


    @GetMapping("/offre")
    public List<Offre> find() {
        return service.find();
    }

    @PostMapping("/offre")
    @ResponseStatus(HttpStatus.CREATED)
    public Offre create(@RequestBody Offre offre) {
        return service.create(offre);
    }

    @PutMapping("/offre/{id}")
    public Offre update(@PathVariable Long id, @RequestBody Map<String, Object> payload) {
        return service.update(id, (int) payload.get("quantity"));
    }

    @DeleteMapping("/offre/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }





}
