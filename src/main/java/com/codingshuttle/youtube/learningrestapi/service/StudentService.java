package com.codingshuttle.youtube.learningrestapi.service;

import com.codingshuttle.youtube.learningrestapi.dto.AddStudentRequestDto;
import com.codingshuttle.youtube.learningrestapi.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<StudentDto> getAllStudent();


    StudentDto getStudentById(Long id);

    StudentDto createnewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
