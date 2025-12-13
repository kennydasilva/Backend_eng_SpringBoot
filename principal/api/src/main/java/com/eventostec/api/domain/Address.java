package com.eventostec.api.domain;

import java.util.*;
import com.eventostec.api.domain.*;

import jakarta.persistence.*;

@Table(name="address")
@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	@Column(nullable = false, length = 100)
	private String city;
	
	@Column(nullable = false, length = 100)
	private String uf;
	
	@ManyToOne
	@JoinColumn(name="event_id")
	private Event event;

}
