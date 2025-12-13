package com.eventostec.api.domain.event;


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
	
	private String title;
	private String description;
	private String imgUrl;
	private String eventoUrl;
	private Boolean remote;
	private Date data;
	
}
