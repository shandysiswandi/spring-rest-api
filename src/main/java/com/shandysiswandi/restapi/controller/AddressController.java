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
public class AddressController {

        @PostMapping(path = "/api/contacts/{contactId}/addresses", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
        public AppResponse<Boolean> create(
                        @PathVariable("contactId") long contactId,
                        @RequestBody String req) {

                return AppResponse.<Boolean>builder()
                                .result(true)
                                .message("Successfully create address")
                                .build();
        }

        @GetMapping(path = "/api/contacts/{contactId}/addresses/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
        public AppResponse<Boolean> get(
                        @PathVariable("contactId") long contactId,
                        @PathVariable("id") long id) {

                return AppResponse.<Boolean>builder()
                                .result(true)
                                .message("Successfully get address")
                                .build();
        }

        @GetMapping(path = "/api/contacts/{contactId}/addresses", produces = MediaType.APPLICATION_JSON_VALUE)
        public AppResponse<Boolean> list(@PathVariable("contactId") long contactId) {

                return AppResponse.<Boolean>builder()
                                .result(true)
                                .message("Successfully list address")
                                .build();
        }

        @PutMapping(path = "/api/contacts/{contactId}/addresses/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
        public AppResponse<Boolean> update(
                        @PathVariable("contactId") long contactId,
                        @PathVariable("id") long id,
                        @RequestBody String req) {

                return AppResponse.<Boolean>builder()
                                .result(true)
                                .message("Successfully update address")
                                .build();
        }

        @DeleteMapping(path = "/api/contacts/{contactId}/addresses/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
        public AppResponse<Boolean> delete(
                        @PathVariable("contactId") long contactId,
                        @PathVariable("id") long id) {

                return AppResponse.<Boolean>builder()
                                .result(true)
                                .message("Successfully delete address")
                                .build();
        }

}
