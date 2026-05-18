package org.example.interfaces;

import org.example.ParkingSpot;
import org.example.Vehicle;

public interface  IParkingFloor {

    void addSpot(ParkingSpot parkingSpot);

    ParkingSpot getAvailableSpots(Vehicle vehicle);

    String getFloorId();

    boolean isUnderMaintaince();

    void setUnderMaintaince(boolean status);

    void showFloorDisplay();

    boolean isFull;

}
