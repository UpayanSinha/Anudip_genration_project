package com.bloodbank.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "blood")
public class Blood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blood_id;
    private String blood_type;
    private Integer donor_id;
    private String quantity;
    private Date date_donated;
    
	public String getBlood_type() {
		return blood_type;
	}
	
	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}
	
	public Integer getDonor_id() {
		return donor_id;
	}
	
	public void setDonor_id(Integer donor_id) {
		this.donor_id = donor_id;
	}
	
	public String getQuantity() {
		return quantity;
	}
	
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public Date getDate_donated() {
		return date_donated;
	}
	
	public void setDate_donated(Date date_donated) {
		this.date_donated = date_donated;
	}
}
