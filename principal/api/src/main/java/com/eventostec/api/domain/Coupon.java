package com.eventostec.api.domain;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.*;
import com.eventostec.api.domain.*;

@Entity
@Table(name="coupon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	@Column(nullable = false, length = 100)
	private String code;
	
	@Column(nullable = false, length = 100)
	private Integer discount;
	
	@Column(nullable = false)
	private LocalDateTime valid;
	
	@ManyToOne
	@JoinColumn(name="event_id")
	private Event event;
	

}
