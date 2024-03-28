package com.shandysiswandi.restapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginRequest {
    
    @NotBlank
    @Size(max = 32, min = 5)
    private String username;

    @NotBlank
    @Size(max = 32, min = 6)
    private String password;
}
