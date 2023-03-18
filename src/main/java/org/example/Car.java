package org.example;

public abstract class Car implements Vehicle {
    protected final double fuelTankSize;
    protected final String fuelType;
    protected final int maxGears;
    protected final double consumptionPer100Km;
    protected double availableFuel;
    protected int tireSize;
    protected String chassisNumber;
    protected double avearageFuelConsumptionPerTrip;
    protected int currentGear = 0;
    protected double totalKm;
    protected double totalFuelConsumption;

    protected Car(double fuelTankSize, String fuelType, int maxGears, double consumptionPer100Km){
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.maxGears = maxGears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.availableFuel = fuelTankSize;
    }
    @Override
    public void start(){
        System.out.println("Starting car");
        avearageFuelConsumptionPerTrip = consumptionPer100Km;
    }
    @Override
    public void stop() {
        this.currentGear = 0;
        System.out.println("Setting current gear to 0");
        System.out.println("Stopping car");
        System.out.println("Available fuel " +String.format("%,.2f", availableFuel));
        System.out.println("Total fuel consumption " + String.format("%,.2f",totalFuelConsumption));
    }
    protected void shiftGear(int gear) {
        if ((gear > maxGears) || (gear < 0)) {
            System.out.println("Invalid gear");}
        else {
            if (this.currentGear < gear ){
                avearageFuelConsumptionPerTrip /= (1+(double)(gear -currentGear)/10);
             }
            else {
                avearageFuelConsumptionPerTrip *= (1+(double)(currentGear - gear)/10);
            }
            currentGear = gear;
        }
    }
    /** Gets the average fuel consumption.
     * @return A double representing the average fuel consumption per trip.
     */
    public double getAverageFuelConsumption() {
       return avearageFuelConsumptionPerTrip;
    }
    @Override
    public void drive(double km){
        double fuelConsumed = km * consumptionPer100Km /100;
        availableFuel -= fuelConsumed;
        System.out.println("Remaining fuel " + String.format("%,.2f",availableFuel));
        totalKm += km;
        totalFuelConsumption += fuelConsumed;
    }

    public double getAvailableFuel() {
        return availableFuel;
    }
}


