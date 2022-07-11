package com.example.studentsystem.service;

import com.example.studentsystem.model.Direction;
import com.example.studentsystem.respository.DirectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectionService implements IDirectionService {

    @Autowired
    private DirectionRepository repository;

    @Override
    public List<Direction> find() {
        return repository.findAllByOrderByIdAsc();
    }

    @Override
    public Direction create(Direction direction) {
        return null;
    }

    @Override
    public Direction update(Long id, int quantity) {
        return repository.findById(id)
                .map(existingDirection -> {
                    existingDirection.setQuantity(quantity);
                    return repository.save(existingDirection);
                })
                .orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}