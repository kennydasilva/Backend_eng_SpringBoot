package com.eventostec.api.domain;

import java.util.*;
import com.eventostec.api.domain.*;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="address")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	@Column(nullable = false, length = 100)
	private String city;
	
	@Column(nullable = false, length = 100)
	private String uf;

	@OneToOne
	@JoinColumn(name = "event_id")
	private Event event;


}
