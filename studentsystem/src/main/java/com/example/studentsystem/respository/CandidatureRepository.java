package com.example.studentsystem.respository;
import com.example.studentsystem.model.Candidature;
import com.example.studentsystem.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CandidatureRepository extends CrudRepository<Candidature,Long> {

}