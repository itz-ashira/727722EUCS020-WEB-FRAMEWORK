package com.example.ashiraq3.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Door {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int doorId;
    public String location;
    public String accessCode;
    public String AccessType;

    
    public Door(int doorId, String location, String accessCode, String accessType) {
        this.doorId = doorId;
        this.location = location;
        this.accessCode = accessCode;
        AccessType = accessType;
    }
    public Door() {
    }
    public int getDoorId() {
        return doorId;
    }
    public void setDoorId(int doorId) {
        this.doorId = doorId;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getAccessCode() {
        return accessCode;
    }
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
    public String getAccessType() {
        return AccessType;
    }
    public void setAccessType(String accessType) {
        AccessType = accessType;
    }

    
}
