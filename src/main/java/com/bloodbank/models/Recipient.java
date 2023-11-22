package com.bloodbank.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "recipient")
public class Recipient{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "recipient_id")
    private int recipient_id;
    @Column(name = "name")
	private String name;
    @Column(name = "address")
	private String address;
    @Column(name = "contact")
	private String contact;


}