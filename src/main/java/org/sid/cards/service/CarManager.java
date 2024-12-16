package org.sid.cards.service;

import org.sid.cards.dao.entity.Car;
import org.sid.cards.dao.repository.CarRepository;
import org.sid.cards.dto.CarDTO;
import org.sid.cards.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager implements CarService {
    @Autowired
    CarRepository carRepository;

    @Autowired
    CarMapper carMapper;

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars= carRepository.findByModel(model);
        List<CarDTO> carDTOS = new ArrayList<>();
        for (Car car : cars) {
            carDTOS.add(carMapper.toCarDTO(car));
        }
        return carDTOS;
    }

    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        Car car = carMapper.toCar(carDTO);
        car = carRepository.save(car);
        return carMapper.toCarDTO(car);
    }
}
