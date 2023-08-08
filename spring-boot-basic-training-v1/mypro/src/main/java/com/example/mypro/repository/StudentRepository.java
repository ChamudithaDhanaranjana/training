package com.example.mypro.repository;
import com.example.mypro.model.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan
@SpringBootApplication
public interface StudentRepository extends MongoRepository<Student, Long> {
}
