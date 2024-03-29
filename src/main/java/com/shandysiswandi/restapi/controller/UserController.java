package com.shandysiswandi.restapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shandysiswandi.restapi.model.AppResponse;

@RestController
public class UserController {

    @GetMapping(path = "/api/users/profile", produces = MediaType.APPLICATION_JSON_VALUE)
    public AppResponse<Boolean> profile() {

        return AppResponse.<Boolean>builder()
                .result(true)
                .message("Successfully get user profile")
                .build();
    }

    @GetMapping(path = "/api/users/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AppResponse<Boolean> getByUsername(@PathVariable("username") String username) {

        return AppResponse.<Boolean>builder()
                .result(true)
                .message("Successfully get user by username")
                .build();
    }

    @PutMapping(path = "/api/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AppResponse<Boolean> update(@PathVariable("id") long id, @RequestBody String req) {

        return AppResponse.<Boolean>builder()
                .result(true)
                .message("Successfully update user")
                .build();
    }

}
