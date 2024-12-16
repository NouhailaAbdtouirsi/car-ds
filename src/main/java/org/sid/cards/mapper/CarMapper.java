package org.sid.cards.mapper;

import org.modelmapper.ModelMapper;
import org.sid.cards.dao.entity.Car;
import org.sid.cards.dto.CarDTO;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private final ModelMapper modelMapper = new ModelMapper();
     public CarDTO toCarDTO(Car car) {
         return modelMapper.map(car, CarDTO.class);
     }

    public Car toCar(CarDTO carDTO) {
        return modelMapper.map(carDTO, Car.class);
    }
}
