package com.example.studentsystem.controller;

import com.example.studentsystem.model.Direction;
import com.example.studentsystem.respository.DirectionRepository;
import com.example.studentsystem.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DirectionController {

    @Autowired
    private DirectionService service;
    private DirectionRepository directionRepository;


    @GetMapping("/direction")
    public List<Direction> find() {
        return service.find();
    }

    @PostMapping("/direction")
    @ResponseStatus(HttpStatus.CREATED)
    public Direction create(@RequestBody Direction direction) {
        return service.create(direction);
    }

    @PutMapping("/direction/{id}")
    public Direction update(@PathVariable Long id, @RequestBody Map<String, Object> payload) {
        return service.update(id, (int) payload.get("quantity"));
    }

    @DeleteMapping("/direction/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }





}
