package com.pembacodes.student.system.service;

import com.pembacodes.student.system.model.Student;

import java.util.List;

public interface StudentService {
   public Student saveStudent(Student student);
   public List<Student> getAllStudents();


}
