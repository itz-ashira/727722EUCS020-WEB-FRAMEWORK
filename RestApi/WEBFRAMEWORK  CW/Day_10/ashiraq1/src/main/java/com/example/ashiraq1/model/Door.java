package com.example.ashiraq1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Door {
    @Id
    private int doorId;
    private String doorType;
    private String material;
    private String color;
    private int price;
}
