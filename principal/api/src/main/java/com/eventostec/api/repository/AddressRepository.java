package com.eventostec.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventostec.api.domain.*;

public interface AddressRepository extends JpaRepository<Address, UUID> {

}
