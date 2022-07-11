package com.example.studentsystem.respository;
import com.example.studentsystem.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

}