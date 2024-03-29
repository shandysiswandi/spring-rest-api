package com.shandysiswandi.restapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shandysiswandi.restapi.model.AppResponse;

@RestController
public class ContactController {

    @PostMapping(path = "/api/contacts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AppResponse<Boolean> create(@RequestBody String req) {

        return AppResponse.<Boolean>builder()
                .result(true)
                .message("Successfully create contact")
                .build();
    }

    @GetMapping(path = "/api/contacts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AppResponse<Boolean> get(@PathVariable("id") long id) {

        return AppResponse.<Boolean>builder()
                .result(true)
                .message("Successfully get contact")
                .build();
    }

    @GetMapping(path = "/api/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
    public AppResponse<Boolean> list() {

        return AppResponse.<Boolean>builder()
                .result(true)
                .message("Successfully list contact")
                .build();
    }

    @PutMapping(path = "/api/contacts/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AppResponse<Boolean> update(@PathVariable("id") long id, @RequestBody String req) {

        return AppResponse.<Boolean>builder()
                .result(true)
                .message("Successfully update contact")
                .build();
    }

    @DeleteMapping(path = "/api/contacts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AppResponse<Boolean> delete(@PathVariable("id") long id) {

        return AppResponse.<Boolean>builder()
                .result(true)
                .message("Successfully delete contact")
                .build();
    }

}
