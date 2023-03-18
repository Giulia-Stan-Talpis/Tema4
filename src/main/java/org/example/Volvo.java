package org.example;

public abstract class Volvo extends Car{
    protected Volvo(double fuelTankSize, String fuelType, int maxGears, double consumptionPer100Km){
        super( fuelTankSize,fuelType,maxGears,consumptionPer100Km);
    }
}
