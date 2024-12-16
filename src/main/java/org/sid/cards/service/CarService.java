package org.sid.cards.service;

import org.sid.cards.dto.CarDTO;

import java.util.List;

public interface CarService {
    List<CarDTO> getCarByModel(String model);

    CarDTO saveCar(CarDTO carDTO);
}
