package com.jash.car_rental.Repository;

import com.jash.car_rental.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByEmail(String email);
}
