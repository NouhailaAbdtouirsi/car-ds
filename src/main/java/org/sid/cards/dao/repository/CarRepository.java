package org.sid.cards.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sid.cards.dao.entity.*;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByModel(String model);
}
