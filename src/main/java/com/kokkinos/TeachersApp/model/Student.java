package com.kokkinos.TeachersApp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@Entity
@Scope("prototype")
public class Student {

    @Id
    private int rollNo;
    private String name;
    @OneToMany(mappedBy = "student")
//    @JoinColumn(name="student_roll_no")
//    @ElementCollection
    private List<Answer> answers;



    public Student() {

    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

}
