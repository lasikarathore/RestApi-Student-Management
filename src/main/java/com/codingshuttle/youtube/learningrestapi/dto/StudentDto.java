package com.codingshuttle.youtube.learningrestapi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDto {


    private Long id;
    private String name;
    private String email;

   //@AllArgsConstructor        yeh consturor with 3 no field apne aap bna deta.
    //@Data       annotation use kr sakte toh contructor n all sb apne aap bn jayge.
}
