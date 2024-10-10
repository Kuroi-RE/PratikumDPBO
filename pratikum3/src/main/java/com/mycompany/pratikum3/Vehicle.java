/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum3;

/**
 *
 * @author whyra
 */
public class Vehicle {
    private String plateNumber;
    private double speed;
    private int numWheels;
    private String vehicleType;
    
    public Vehicle(String plateNumber, double speed, int numWheels, String vehicleType) {
        this.plateNumber = plateNumber;
        this.speed = speed;
        this.numWheels = numWheels;
        this.vehicleType = vehicleType;

    }
    
    public Vehicle(String plateNumber, double speed) {
        this(plateNumber, speed, 4, "Uknown");
    }
    
    public Vehicle(String plateNumber) {
        this(plateNumber, 0.0, 4, "Uknown");
    }
    
    public double calculateTravelTime(double distance) {
        return distance / speed;
    }
    
    public double calculateTravelTime(double distance, double customSpeed) {
        return distance / customSpeed;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public int getNumWheels() {
        return numWheels;
    }
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }
}   
