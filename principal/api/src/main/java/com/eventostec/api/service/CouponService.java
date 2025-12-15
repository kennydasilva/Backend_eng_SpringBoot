package com.eventostec.api.service;

import com.eventostec.api.domain.Coupon;
import com.eventostec.api.domain.Event;
import com.eventostec.api.dto.CouponRequestDTO;
import com.eventostec.api.repository.CouponRepository;
import com.eventostec.api.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CouponService {


    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private EventRepository eventRepository;


    public Coupon addCouponToEvent(UUID eventId, CouponRequestDTO couponRequestDTO) {
        Event event=eventRepository.findById(eventId)
                .orElseThrow(() -> new IllegalArgumentException("Event not found"));


        Coupon coupon=new Coupon();
        coupon.setCode(couponRequestDTO.code());
        coupon.setDiscount(couponRequestDTO.discount());
        coupon.setValid(couponRequestDTO.valid());
        coupon.setEvent(event);


        return couponRepository.save(coupon);

    }
}
