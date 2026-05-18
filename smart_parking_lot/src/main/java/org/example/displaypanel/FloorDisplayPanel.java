package org.example.displaypanel;

import org.example.ParkingSpot;
import org.example.SpotType;

import java.util.Map;
import java.util.Set;

public class FloorDisplayPanel extends  DisplayPanel{

    private final String floorId;

    public FloorDisplayPanel(String floorId) {
        this.floorId = floorId;
    }

    public void displayAvailableSpots(Map<SpotType, Set<ParkingSpot>> spotMap,boolean underMaintaince)
    {
        if(underMaintaince)
        {
            System.out.println("Display @Floor " +floorId +"This floor is under maintaince");
            return;
        }
        System.out.println("Display @floor " +floorId+ ":Available spots:");
        for(Map.Entry<SpotType ,Set<ParkingSpot>> entry: spotMap.entrySet() ){
            long available= entry.getValue().stream().filter(spot-> !spot.isOccupied()).count());
        System.out.println("-" +entry.getKey() +":" +available +"spots(s)");
        }
    }

}
