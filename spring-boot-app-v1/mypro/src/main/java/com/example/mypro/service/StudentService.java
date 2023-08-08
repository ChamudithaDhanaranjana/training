package com.example.mypro.service;
import com.example.mypro.model.Student;
import com.example.mypro.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository; // Assuming you've created a StudentRepository interface

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public boolean deleteStudentById(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id)
            ;
            return true;
        }
        return false;
    }
}
