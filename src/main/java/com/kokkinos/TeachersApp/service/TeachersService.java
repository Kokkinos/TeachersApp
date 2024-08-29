package com.kokkinos.TeachersApp.service;


import com.kokkinos.TeachersApp.model.Teacher;
import com.kokkinos.TeachersApp.repo.TeachersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeachersService {

    @Autowired
    private TeachersRepo repo;

    public void addTeacher(Teacher teacher){
        repo.save(teacher);
    }

    public List<Teacher> getAllTeachers(){
        return repo.findAll();
    }

    public void load(){
        List<Teacher> teachers = new ArrayList<>(List.of(new Teacher()));

    }

}
