package com.eventostec.api.dto;

import java.time.LocalDateTime;

public record CouponRequestDTO(String code, Integer discount, LocalDateTime valid) {

}
