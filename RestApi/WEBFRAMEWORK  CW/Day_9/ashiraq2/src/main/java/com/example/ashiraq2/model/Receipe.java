package com.example.ashiraq2.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Receipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int receipeId;
    public String title;
    public String ingredients;
    public String instructions;
    public String receipeName;
}
