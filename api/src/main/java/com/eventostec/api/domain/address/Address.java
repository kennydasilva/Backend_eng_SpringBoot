package com.eventostec.api.domain.address;

import java.util.*;
import com.eventostec.api.domain.event.*;

import jakarta.persistence.*;

@Table(name="address")
@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	private String city;
	
	private String uf;
	
	@ManyToOne
	@JoinColumn(name="event_id")
	private Event event;

}
