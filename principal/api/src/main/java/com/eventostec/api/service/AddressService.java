package com.eventostec.api.service;

import com.eventostec.api.domain.Address;
import com.eventostec.api.domain.Event;
import com.eventostec.api.dto.EventRequestDTO;
import com.eventostec.api.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(EventRequestDTO data, Event event){
        Address address=new Address();
        address.setCity(data.city());
        address.setUf(data.state());
        address.setEvent(event);

        return  addressRepository.save(address);
    }
}
