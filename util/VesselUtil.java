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

}
