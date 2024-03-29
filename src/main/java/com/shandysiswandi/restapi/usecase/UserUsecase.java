package com.shandysiswandi.restapi.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shandysiswandi.restapi.repository.UserRepository;

@Service
public class UserUsecase {

    @Autowired
    private ValidationService validation;

    @Autowired
    private UserRepository userRepo;

    @Transactional
    public void profile() {

        validation.validate(null);

        // TODO:
    }

    @Transactional
    public void getByUsername() {

        validation.validate(null);

        // TODO:
    }

    @Transactional
    public void update() {

        validation.validate(null);

        // TODO:
    }

}
