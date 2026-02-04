package ui;

import model.Vessel;
import util.VesselUtil;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VesselUtil vesselUtil = new VesselUtil();

        System.out.println("Enter number of vessels");
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter vessel details (id:name:speed:type)");
        for (int i = 0; i < count; i++) {

            String[] data = scanner.nextLine().split(":");

            Vessel vessel = new Vessel(
                    data[0],
                    data[1],
                    Double.parseDouble(data[2]),
                    data[3]
            );

            vesselUtil.addVesselPerformance(vessel);
        }

        System.out.println("Enter vessel id to search");
        String searchId = scanner.nextLine();

        Vessel result = vesselUtil.getVesselById(searchId);

        if (result != null) {
            System.out.println(
                    result.getVesselId() + " | " +
                            result.getVesselName() + " | " +
                            result.getVesselType() + " | " +
                            result.getAverageSpeed()
            );
        } else {
            System.out.println("Vessel Id " + searchId + " not found");
        }

        System.out.println("High performance vessels:");
        List<Vessel> highPerformance = vesselUtil.getHighPerformanceVessels();

        for (Vessel v : highPerformance) {
            System.out.println(
                    v.getVesselId() + " | " +
                            v.getVesselName() + " | " +
                            v.getVesselType() + " | " +
                            v.getAverageSpeed()
            );
        }

        scanner.close();
    }
}
