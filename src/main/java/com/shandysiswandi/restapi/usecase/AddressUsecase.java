package com.shandysiswandi.restapi.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shandysiswandi.restapi.repository.AddressRepository;

@Service
public class AddressUsecase {

    @Autowired
    private ValidationService validation;

    @Autowired
    private AddressRepository addressRepo;

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
