package org.example.parkingFloor;

import org.example.ParkingSpot;
import org.example.SpotType;
import org.example.Vehicle;
import org.example.displaypanel.FloorDisplayPanel;
import org.example.interfaces.IParkingFloor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ParkingFloor implements IParkingFloor {

    private  final String floorId;

    private final Map<SpotType, Set<ParkingSpot>> spotTypeSetMap;

    private final FloorDisplayPanel floorDisplayPanel;

    private boolean underMaintaince;

    public ParkingFloor(String floorId) {
        this.floorId = floorId;
        this.spotTypeSetMap = new HashMap<>();
        this.floorDisplayPanel = new FloorDisplayPanel(floorId);
        this.underMaintaince = false;
    }

    @Override
    public void addSpot(ParkingSpot parkingSpot) {
    spotTypeSetMap.get(parkingSpot.getSpotType()).add(parkingSpot);
    }

    @Override
    public ParkingSpot getAvailableSpots(Vehicle vehicle) {
        if(underMaintaince)
        {
            return null;
        }
        for(Map.Entry<SpotType,Set<ParkingSpot>> entry:spotTypeSetMap.entrySet())
        {
            for(ParkingSpot spot: entry.getValue())
            {
                if(spot.canFitVehicle(vehicle))
                {
                    return spot;
                }
            }
        }
        return null;
    }

    @Override
    public String getFloorId() {
        return "";
    }

    @Override
    public boolean isUnderMaintaince() {
        return false;
    }

    @Override
    public void setUnderMaintaince(boolean status) {

    }

    @Override
    public void showFloorDisplay() {

    }
}
