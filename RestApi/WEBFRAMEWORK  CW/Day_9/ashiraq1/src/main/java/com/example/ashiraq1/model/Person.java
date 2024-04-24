package com.example.ashiraq1.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int personId;
    public String firstName;
    public String lastName;
    public int age;
    public String gender;
    public String email;
}
