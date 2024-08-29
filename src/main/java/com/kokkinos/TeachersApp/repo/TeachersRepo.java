package com.kokkinos.TeachersApp.repo;

import com.kokkinos.TeachersApp.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepo extends JpaRepository<Teacher, Integer> {

}
