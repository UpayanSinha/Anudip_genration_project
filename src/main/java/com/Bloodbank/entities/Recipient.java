package com.Bloodbank.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Data
@Entity
@Table(name="Recipient")
@ToString
@DynamicUpdate
@DynamicInsert
public class Recipient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rId")
    private Integer rId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private String age;
    @Column(name = "gender")
    private String gender;
    @Column(name = "bloodType")
    private String bloodType;
    @Column(name = "UnitNeeded")
    private String UnitNeeded;

    @ManyToOne
    private User user;

}