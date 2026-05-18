package org.example;

public class Vehicle {

    private final String licenceNumber;

    private final VehicleType  vehicleType;

    public Vehicle(String licenceNumber, VehicleType vehicleType) {
        this.licenceNumber = licenceNumber;
        this.vehicleType = vehicleType;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
