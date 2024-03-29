package com.shandysiswandi.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shandysiswandi.restapi.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
