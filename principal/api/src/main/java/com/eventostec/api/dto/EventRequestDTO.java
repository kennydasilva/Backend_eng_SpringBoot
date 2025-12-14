package com.eventostec.api.dto;

import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String title, String description, LocalDateTime date, String city, String state, Boolean remote, String eventUrl, MultipartFile image ) {

}
