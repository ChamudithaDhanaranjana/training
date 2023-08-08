package com.example.mypro.Controller;

import com.example.mypro.model.Student;
import com.example.mypro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/show")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("view/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        if (student != null) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
    @DeleteMapping("/delete/{id}") // Define the endpoint mapping with a path variable
    public ResponseEntity<String> deleteStudentById(@PathVariable Long id) {
        boolean deleted = studentService.deleteStudentById(id);

        if (deleted) {
            return ResponseEntity.ok("Student deleted successfully"); // Return 200 OK with a success message
        } else {
            return ResponseEntity.notFound().build(); // Return 404 Not Found if student not found
        }
    }
}
