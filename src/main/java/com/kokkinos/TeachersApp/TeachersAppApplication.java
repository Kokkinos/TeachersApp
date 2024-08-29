package com.kokkinos.TeachersApp;

import com.kokkinos.TeachersApp.model.Student;
import com.kokkinos.TeachersApp.model.Teacher;
import com.kokkinos.TeachersApp.repo.TeachersRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TeachersAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(TeachersAppApplication.class, args);
//
//		TeachersRepo repo = context.getBean(TeachersRepo.class);
//
//		Teacher t1 = context.getBean(Teacher.class);
//
//		t1.setId(1);
//		t1.setName("George");
//		t1.setYearsOfExperience(2);
//
//		repo.save(t1);
//		System.out.println(repo.findAll());


	}


}
