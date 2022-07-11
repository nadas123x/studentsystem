package com.example.studentsystem.respository;

import com.example.studentsystem.model.Offre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {

    List<Offre> findAllByOrderByIdAsc();

    @Query("from Offre b where b.name=:keyword OR b.description=:keyword OR b.quantity=:keyword OR b.imageback=:keyword OR b.datepub=:keyword")
    Page<Offre> findAll(Pageable pageable, @Param("keyword") String keyword);

}
