package com.eventostec.api.domain;
import jakarta.persistence.*;
import lombok.*;
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
	
	private String code;
	private Integer discount;
	private Date valid;
	
	@ManyToOne
	@JoinColumn(name="event_id")
	private Event event;
	

}
