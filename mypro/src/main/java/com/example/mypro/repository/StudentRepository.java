package com.example.mypro.repository;
import com.example.mypro.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Long> {
}
