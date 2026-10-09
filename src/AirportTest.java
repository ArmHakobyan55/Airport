
import model.Plane;
import service.PlaneService;
import service.FileService;

public class AirportTest {

        public static void main(String[] args) throws Exception {

                Plane plane1 = new Plane();
                plane1.setModel("Boing");
                plane1.setCountry("Hayastan");
                plane1.setYear(1903);
                plane1.setHourse(14.00);
                plane1.setMilitary(false);
                plane1.setWeight(10000);
                plane1.setWingspan(10);
                plane1.setTopSpeed(1000);
                plane1.setSeats(98);
                plane1.setCost(445.8);

                Plane plane2 = new Plane();
                plane2.setModel("Babken");
                plane2.setCountry("Vrastan");
                plane2.setYear(2005);
                plane2.setMilitary(true);
                plane2.setWingspan(15);
                plane2.setTopSpeed(2414);
                plane2.setSeats(67);
                plane2.setCost(150.0);

                Plane plane3 = new Plane();
                plane3.setModel("Arman");
                plane3.setCountry("Rusastan");
                plane3.setYear(2005);
                plane3.setMilitary(false);
                plane3.setWingspan(15);
                plane3.setTopSpeed(2414);
                plane3.setSeats(47);
                plane3.setCost(150.0);

                Plane[] planes = {plane1, plane2, plane3};

                PlaneService planeService = new PlaneService();

                planeService.Task1(plane1);
                planeService.Task2(plane1);

                Plane newer = planeService.Task3(plane1, plane2);
                FileService.writeFile("output.txt", "Newer plane: " + newer.getModel() + "\n");

                String bigger = planeService.Task4(plane1, plane2);
                FileService.writeFile("output.txt", "Bigger wingspan: " + bigger + "\n");

                planeService.Task5(plane1, plane2, plane3);
                planeService.Task6(planes);
        }
}