package com.example.ashiraq1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ashiraq1.model.Door;

public interface DoorRepo extends JpaRepository<Door,Integer>{
    
    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<Door> findByColor(String color);

    public List<Door> findByDoorType(String doortype);

}
