package com.kokkinos.TeachersApp.repo;

import com.kokkinos.TeachersApp.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepo extends JpaRepository<Answer,Integer> {
}
