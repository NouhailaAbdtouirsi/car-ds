
package org.sid.cards.web;

import org.sid.cards.dto.CarDTO;
import org.sid.cards.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQlController {
    @Autowired
    private CarService carService;

    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model) {
        return carService.getCarByModel(model);
    }

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO car) {
        return carService.saveCar(car);
    }
}
