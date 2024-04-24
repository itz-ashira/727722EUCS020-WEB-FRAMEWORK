package com.example.ashira3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ashira3.model.Village;

public interface VillageRepo extends JpaRepository<Village,Integer>{
    
    @Query("SELECT u FROM Village u WHERE u.name=:name")
    public List<Village> getByName(String name);
    
    @Query("SELECT u FROM Village u WHERE u.villagePopulation=:population")
    public List<Village> getByPopulation(int population);

}
