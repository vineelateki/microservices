package com.wipro.java.ms.i;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new FeeParking(); // Creating a free parking lot
        Car myCar = new Car(); // Creating a car object
        
        parkingLot.parkCar(); // Parking the car
        parkingLot.unparkCar(); // Unparking the car
        parkingLot.getCapacity(); // Checking capacity
        
        double fee = parkingLot.calculateFee(myCar);
        System.out.println("Parking Fee: " + fee);

        try {
            parkingLot.doPayment(myCar); // Attempting to make payment
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
