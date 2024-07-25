package com.jash.car_rental.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class BookCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private int days;
    private int price;
    private Date fromDate;
    private Date toDate;
}
