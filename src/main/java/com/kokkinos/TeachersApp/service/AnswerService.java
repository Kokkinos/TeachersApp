package com.kokkinos.TeachersApp.service;

import com.kokkinos.TeachersApp.model.Answer;
import com.kokkinos.TeachersApp.repo.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepo repo;

    public void addAnswer(Answer answer){
        repo.save(answer);
    }
}
