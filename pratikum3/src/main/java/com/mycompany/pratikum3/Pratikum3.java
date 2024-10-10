/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratikum3;

/**
 *
 * @author whyra
 */
public class Pratikum3 {

    public static void main(String[] args) {
        String plat = "B1234XYZ";
        double speed = 100.0;
        int NumOfWheels = 4;
        String VehicleType = "Car";
        double time = 500;
        double customTime = 80.0;
        
        
        Vehicle car = new Vehicle(plat, speed, NumOfWheels, VehicleType);
        double travelTime = car.calculateTravelTime(time);
        System.out.println("Plate Number : " + plat);
        System.out.println("Speed : " + speed + " km/h");
        System.out.println("Number of Wheels: " + NumOfWheels);
        System.out.println("Vehicle Type: " + VehicleType);

        System.out.println("Travel Time for " + speed + "km:" + travelTime + " hours");
        
        double travelTimeWithCustomSpeed = car.calculateTravelTime(time, 80.0);
        System.out.println("Travel Time for = "+ speed + " km with custom speed " + customTime + " km/h" + travelTimeWithCustomSpeed + " hours");
    }
}
