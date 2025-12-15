package com.eventostec.api.domain;


import java.time.LocalDateTime;

import java.util.*;

import jakarta.persistence.*;
import lombok.*;


@Table(name="event")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Event {

	@Id
	@GeneratedValue
	private UUID id;
	
	@Column(nullable = false, length = 200)
	private String title;
	
	@Column(nullable = false, length = 200)
	private String description;
	
	 @Column(nullable = false, length = 200)
	private String imgUrl;
	 
	@Column(nullable = false, length = 500)
	private String eventoUrl;
	 
	@Column(nullable = false)
	private Boolean remote;
	 
	@Column(nullable = false)
	private LocalDateTime date;


	
	
}
