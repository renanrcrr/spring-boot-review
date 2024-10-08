package io.rcrr.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.rcrr.springboot.domains.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
