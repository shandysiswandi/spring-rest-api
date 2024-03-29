package com.shandysiswandi.restapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginInput {

    @NotBlank
    @Size(max = 32, min = 5)
    private String username;

    @NotBlank
    @Size(max = 64, min = 6)
    private String password;

}
