package com.shandysiswandi.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shandysiswandi.restapi.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
