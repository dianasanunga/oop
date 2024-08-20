package test;

import Student.Student;
import exception.DuplicatedStudentCodeException;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student("valeska", "Adrian", 10, "01");
        Student s2 = new Student("Akira", "Sanunga", 18, "02");


        List<Student> studentList = new ArrayList<>();
        Student s3 = new Student("Diana", "Sanunga", 18, "01");
        Student s4 = new Student("daniela", "haro", 28, "03");
        try {
            addStudent(s1, studentList);
            addStudent(s2, studentList);
            addStudent(s3, studentList);
            addStudent(s4, studentList);

        } catch (DuplicatedStudentCodeException de) {
            System.out.println(de.getMessage());
        }
    }
        public static void addStudent(Student s, List<Student> studentList) throws DuplicatedStudentCodeException {
            for (Student stu : studentList) {
                if (stu.getStudentCode().equalsIgnoreCase(s.getStudentCode())) {
                    throw new DuplicatedStudentCodeException("Student Name " + s.getStudentCode() + " , already exists. studentList: " + studentList);
                }
            }
            studentList.add(s);
        }
    }
