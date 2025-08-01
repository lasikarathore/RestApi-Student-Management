package com.codingshuttle.youtube.learningrestapi.controller;


import com.codingshuttle.youtube.learningrestapi.dto.AddStudentRequestDto;
import com.codingshuttle.youtube.learningrestapi.dto.StudentDto;
import com.codingshuttle.youtube.learningrestapi.entity.Student;
import com.codingshuttle.youtube.learningrestapi.repository.StudentRepository;
import com.codingshuttle.youtube.learningrestapi.service.StudentService;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;



    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudent(){
    // return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudent());
    return ResponseEntity.ok(studentService.getAllStudent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody @Valid AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createnewStudent(addStudentRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id,@RequestBody AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.ok(studentService. updateStudent(id,addStudentRequestDto));
    }


    @PatchMapping("/{id}")
    public ResponseEntity<StudentDto> updatePartialStudent(@PathVariable Long id, @RequestBody Map<String,Object> updates) {
        return ResponseEntity.ok(studentService. updatePartialStudent(id,updates));
    }


}
//respose entity batatta h http ka status get,post kya kr rhe h apn esa.