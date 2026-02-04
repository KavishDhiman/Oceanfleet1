package util;

import model.Vessel;
import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList;

    public VesselUtil() {
        vesselList = new ArrayList<>();
    }

    // UC2: add vessel
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    public List<Vessel> getVesselList() {
        return vesselList;
    }
    // UC3: get vessel by ID
    public Vessel getVesselById(String vesselId) {

        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }
        return null;
    }
    // UC4: get high performance vessels
    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> highPerformanceVessels = new ArrayList<>();
        double maxSpeed = 0;

        // Find max speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        // Collect vessels with max speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxSpeed) {
                highPerformanceVessels.add(vessel);
            }
        }

        return highPerformanceVessels;
    }


}
