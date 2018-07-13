package com.spring.boot.example.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by andriusbaltrunas on 7/12/2018.
 */
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String email;
}
