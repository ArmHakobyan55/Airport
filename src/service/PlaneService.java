
package service;

import model.Plane;

public class PlaneService {

    // Task 1
    public void Task1(Plane plane1) throws Exception {
        FileService.writeFile("output.txt",
                "Model: " + plane1.getModel() + "\n" +
                        "Country: " + plane1.getCountry() + "\n" +
                        "Year: " + plane1.getYear() + "\n" +
                        "Hours: " + plane1.getHourse() + "\n" +
                        "Military: " + plane1.isMilitary() + "\n" +
                        "Weight: " + plane1.getWeight() + "\n" +
                        "Wingspan: " + plane1.getWingspan() + "\n" +
                        "Top speed: " + plane1.getTopSpeed() + "\n" +
                        "Seats: " + plane1.getSeats() + "\n" +
                        "Cost: " + plane1.getCost() + "\n\n");
    }

    // Task 2
    public void Task2(Plane plane1) throws Exception {
        if (plane1.isMilitary()) {
            FileService.writeFile("output.txt", "Cost + Top speed: " + (plane1.getCost() + plane1.getTopSpeed()) + "\n");
        } else {
            FileService.writeFile("output.txt", "Model: " + plane1.getModel() + "\n" + "Country: " + plane1.getCountry() + "\n");
        }
    }

    // Task 3
    public Plane Task3(Plane plane1, Plane plane2) {
        if (plane1.getYear() >= plane2.getYear()) {
            return plane1;
        } else {
            return plane2;
        }
    }

    // Task 4
    public String Task4(Plane plane1, Plane plane2) {
        if (plane1.getWingspan() > plane2.getWingspan()) {
            return plane1.getModel();
        } else {
            return plane2.getModel();
        }
    }

    // Task 5
    public void Task5(Plane plane1, Plane plane2, Plane plane3)
            throws Exception {
        Plane x = plane1;

        if (plane2.getSeats() < x.getSeats()) {
            x = plane2;
        }

        if (plane3.getSeats() < x.getSeats()) {
            x = plane3;
        }

        FileService.writeFile("output.txt", "Country with smallest seats: " + x.getCountry() + "\n");
    }

    // Task 6
    public void Task6(Plane[] planes) throws Exception {
        FileService.writeFile("output.txt", "Not military planes:\n");

        for (int i = 0; i < planes.length; i++) {
            if (!planes[i].isMilitary()) {
                FileService.writeFile("output.txt", planes[i].toString() + "\n");
            }
        }

        FileService.writeFile("output.txt", "\n");
    }
}