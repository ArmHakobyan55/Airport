package service;
import model.Plane;

public class PlaneService {

    public void Task1(Plane plane1){
        System.out.println(plane1.getModel());
        System.out.println(plane1.getCountry());
        System.out.println(plane1.getYear());
        System.out.println(plane1.getHourse());
        System.out.println(plane1.isMilitary());
        System.out.println(plane1.getWeight());
        System.out.println(plane1.getWingspan());
        System.out.println(plane1.getTopSpeed());
        System.out.println(plane1.getSeats());;
        System.out.println(plane1.getCost());

    }
    public void Task2(Plane plane1){
       if(plane1.isMilitary()){
            System.out.println(plane1.getCost() + plane1.getTopSpeed());
        }else{
           System.out.println(plane1.getModel() + plane1.getCountry());
       }
    }
    public Plane Task3(Plane plane1, Plane plane2) {
        if (plane1.getYear() >= plane2.getYear()) {
            return plane1;
        } else {
            return plane2;
        }
    }
    public String Task4(Plane plane1, Plane plane2) {
        if (plane1.getWingspan() > plane2.getWingspan()) {
            return plane1.getModel();
        } else {
            return plane2.getModel();
        }
    }
    public void Task5(Plane plane1, Plane plane2, Plane plane3) {
        Plane x = plane1;
        if (plane2.getSeats() < x.getSeats()) {
            x = plane2;
        }
        if (plane3.getSeats() < x.getSeats()) {
            x = plane3;
        }
        System.out.println("Country: " + x.getCountry());
    }

    public  void Task6(Plane[] planes){
        for (int i = 0 ; i < planes.length; i++ )
            if (!planes[i].isMilitary()){
                System.out.println(planes[i]);
            }
    }
}
