package com.shandysiswandi.restapi.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shandysiswandi.restapi.repository.ContactRepository;

@Service
public class ContactUsecase {

    @Autowired
    private ValidationService validation;

    @Autowired
    private ContactRepository contactRepo;

    @Transactional
    public void create() {

        validation.validate(null);

        // TODO:
    }

    @Transactional
    public void get() {

        validation.validate(null);

        // TODO:
    }

    @Transactional
    public void list() {

        validation.validate(null);

        // TODO:
    }

    @Transactional
    public void update() {

        validation.validate(null);

        // TODO:
    }

    @Transactional
    public void delete() {

        validation.validate(null);

        // TODO:
    }

}
