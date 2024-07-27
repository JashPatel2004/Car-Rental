package com.jash.car_rental.Repository;

import com.jash.car_rental.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
