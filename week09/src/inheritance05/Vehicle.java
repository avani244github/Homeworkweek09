package inheritance05;

public class Vehicle {
    public static void main(String[] args) {
        Vehicle c1 = new Vehicle();
        c1.distancetraveled(200);
        c1.fuelefficiency(30,40);
        c1.maximumspeed(300);
        c1.properties("BMW","BM0234",2002,"Diesel");

    }
    public void fuelefficiency(double distance, double fuelused){
        double fuelefficiency = distance/fuelused;
        System.out.println("fuelefficiency: "+ fuelefficiency);
    }
        public void distancetraveled(double dist){
            System.out.println("distancetraveled: "+ dist);
    }
    public void maximumspeed(double maxspeed){
        System.out.println("maximumspeed: "+maxspeed);
    }
    public void properties (String make,String model,int year,String fueltype){
        System.out.println("Making of :- " +make);
        System.out.println("Model no. :- "+model);
        System.out.println("Vehicle Year :- " + year);
        System.out.println("Type of Year :- "+ fueltype);
    }





}
