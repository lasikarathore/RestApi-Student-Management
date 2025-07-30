package com.codingshuttle.youtube.learningrestapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

public class AddStudentRequestDto {

    @NotBlank(message = "name is required")
    @Size(min =3, max = 30,message = "name should be of length 3 to 30 characters")
    private String name;

    @Email
    @NotBlank(message = "email should not be blank")
    private String email;

    //@AllArgsConstructor        yeh consturor with 3 no field apne aap bna deta.
    //@Data       annotation use kr sakte toh contructor n all sb apne aap bn jayge.
}