package org.sid.cards;

import org.sid.cards.dto.CarDTO;
import org.sid.cards.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarDsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarDsApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CarService carService){
        return args -> {
            carService.saveCar(
                    CarDTO.builder()
                            .color("Red")
                            .matricule("A123")
                            .model("BMW")
                            .price(100000)
                            .build()
            );
            carService.saveCar(
                    CarDTO.builder()
                            .color("Blue")
                            .matricule("B123")
                            .model("Mercedes")
                            .price(200000)
                            .build()
            );
            carService.saveCar(
                    CarDTO.builder()
                            .color("Black")
                            .matricule("C123")
                            .model("Audi")
                            .price(300000)
                            .build()
            );

        };
    }

}
