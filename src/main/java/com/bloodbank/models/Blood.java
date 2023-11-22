package com.bloodbank.models;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "blood")
public class Blood {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "blood_id")
    private int blood_id;
    @Column(name = "blood_type")
	private String blood_type;
    @Column(name = "donor_id")
	private Integer donor_id;
    @Column(name = "quantity")
	private String quantity;
    @Column(name = "date_donated")
	private Date date_donated;

}
