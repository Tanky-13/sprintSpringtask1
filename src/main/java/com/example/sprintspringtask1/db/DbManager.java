package com.example.sprintspringtask1.db;

import com.example.sprintspringtask1.modals.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DbManager {

    @Getter
    private static List<Student> students=new ArrayList<>();
    private static Long id=4L;

    static {
        students.add(new Student(1L,"Alizhan","Tank",49,"F"));
        students.add(new Student(2L,"Serzhan","Kira",90,"A"));
        students.add(new Student(3L,"Asset","Imanity",89,"B"));
    }

    private static void calculateMark(Student student){
        var exam=student.getExam();
        if (exam==null){
            return;
        }
        if(exam>=90){
        student.setMark("A");
        } else if (exam>=75) {
            student.setMark("B");
        }
        else if (exam>=60) {
            student.setMark("C");
        }
        else if (exam>=50) {
            student.setMark("D");
        }
        else {
            student.setMark("F");
        }
    }
    public static void addStudent(Student student){
        student.setId(id);
        calculateMark(student);
    students.add(student);
    id++;

    }
}