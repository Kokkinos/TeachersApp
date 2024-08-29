package com.kokkinos.TeachersApp;

import com.kokkinos.TeachersApp.model.Answer;
import com.kokkinos.TeachersApp.model.Student;
import com.kokkinos.TeachersApp.service.AnswerService;
import com.kokkinos.TeachersApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
public class AppRESTController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private AnswerService answerService;

//    @GetMapping("students")
//    public List<Student> fetchStudents(){
//
//    }

    @GetMapping("load")
    public String loadData(){
        return "success loading data";
    }

//    @GetMapping("student/{studentId}")
//    public Student getStudent(@PathVariable("studentId") int studentId){
//
//    }

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @PostMapping("student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PostMapping("/students/{rollNo}/answer")
    public void addStudentAnswer(@PathVariable int rollNo,@RequestBody Answer answer){
        Student student = studentService.getStudent(rollNo);

        answer.setStudent(student);
        answerService.addAnswer(answer);
    }
}
