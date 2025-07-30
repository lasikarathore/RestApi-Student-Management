package com.codingshuttle.youtube.learningrestapi.repository;


import com.codingshuttle.youtube.learningrestapi.entity.Student;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
