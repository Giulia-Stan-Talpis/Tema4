package org.example;
public class App 
{
    public static void main( String[] args )
    {
        Car xc60 = new XC60(70,"Diesel",6,7);
        Car octavia = new Octavia(50,"petrol", 5, 5.5);
        xc60.start();
        xc60.shiftGear(4);
        xc60.drive(20);
        xc60.shiftGear(2);
        xc60.drive(3.5);
        xc60.stop();
        double averageConsumption = xc60.getAverageFuelConsumption();
        System.out.println("Average fuel consumption is " + String.format("%,.2f", averageConsumption));
        double availableFuel = xc60.getAvailableFuel();
        System.out.println("Available fuel " + String.format("%,.2f",availableFuel));
        xc60.start();
        xc60.shiftGear(5);
        xc60.drive(100);
        averageConsumption = xc60.getAverageFuelConsumption();
        System.out.println("Average fuel consumption is " + String.format("%,.2f", averageConsumption));
        availableFuel = xc60.getAvailableFuel();
        System.out.println("Available fuel " + String.format("%,.2f",availableFuel));


    }
}
