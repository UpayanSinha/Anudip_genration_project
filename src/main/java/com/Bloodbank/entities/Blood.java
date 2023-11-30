package com.Bloodbank.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Data
@Entity
@Table(name="Blood")
@ToString
@DynamicUpdate
@DynamicInsert
public class Blood{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bId")
    private Integer bId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private String age;

    //still not done yet have to do relation between other table

}