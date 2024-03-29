package com.shandysiswandi.restapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegistrationInput {

    @NotBlank
    @Size(max = 100, min = 5)
    private String name;

    @NotBlank
    @Size(max = 32, min = 5)
    private String username;

    @NotBlank
    @Size(max = 64, min = 6)
    private String password;

}
