package com.example.studentsystem.service;

import com.example.studentsystem.model.Direction;

import java.util.List;

public interface IDirectionService {

    List<Direction> find();
    Direction create(Direction direction);
    Direction update(Long id, int quantity);
    void delete(Long id);

}
