package com.example.studentsystem.respository;

import java.util.Optional;

import com.example.studentsystem.model.ERole;
import com.example.studentsystem.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

	Optional<Role> findByName(ERole name);


}
