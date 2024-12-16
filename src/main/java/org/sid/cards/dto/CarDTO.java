package org.sid.cards.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CarDTO {
    private String model;
    private String color;
    private String matricule;
    private double price;
}
