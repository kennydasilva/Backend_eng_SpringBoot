package com.eventostec.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventostec.api.domain.coupon.*;
public interface CouponRepository extends JpaRepository<Coupon, UUID> {

}
