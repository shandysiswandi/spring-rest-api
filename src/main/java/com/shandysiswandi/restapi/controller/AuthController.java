package com.shandysiswandi.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shandysiswandi.restapi.entity.User;
import com.shandysiswandi.restapi.model.LoginInput;
import com.shandysiswandi.restapi.model.LoginOutput;
import com.shandysiswandi.restapi.model.RegistrationInput;
import com.shandysiswandi.restapi.model.RestResponse;
import com.shandysiswandi.restapi.usecase.AuthUsecase;

@RestController
public class AuthController {

    @Autowired
    private AuthUsecase authUsecase;

    @PostMapping(path = "/api/auth/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<LoginOutput> login(@RequestBody LoginInput req) {
        var resp = authUsecase.login(req);

        return RestResponse.<LoginOutput>builder()
                .result(resp)
                .message("Successfully Login")
                .build();
    }

    @PostMapping(path = "/api/auth/registration", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<Boolean> registration(@RequestBody RegistrationInput req) {
        var resp = authUsecase.registration(req);

        return RestResponse.<Boolean>builder()
                .result(resp)
                .message("Successfully Registration")
                .build();
    }

    @DeleteMapping(path = "/api/auth/logout", produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse<Boolean> logout(User user) {
        var resp = authUsecase.logout(user);

        return RestResponse.<Boolean>builder()
                .result(resp)
                .message("Successfully Logout")
                .build();
    }

}
