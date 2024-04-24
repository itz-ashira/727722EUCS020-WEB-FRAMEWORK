package com.example.ashira3.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Village {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int villageId;
    public String villageName;
    public int numOfMen;
    public int numOfWomen;
    public int villagePopulation;
    public int numOfSchools;
}
