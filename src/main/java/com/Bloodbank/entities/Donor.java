package com.Bloodbank.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Data
@Entity
@Table(name="Donor")
@ToString
@DynamicUpdate
@DynamicInsert
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dId")
    private Integer dId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private String age;
    @Column(name = "gender")
    private String gender;
    @Column(name = "bloodType")
    private String bloodType;
    @Column(name = "UnitDonated")
    private String UnitDonated;
    @Column(name = "contactInfo")
    private String contactInfo;

    @ManyToOne
    private User user;

}
