package inheritance05;

public class Motorcycle extends Vehicle{
    public static void main(String[] args) {
        Motorcycle c = new Motorcycle();
        c.properties("BMW","BM0023",2021,"Petrol");
        c.fuelefficiency(180,15);
        c.distancetraveled(80.8);
        c.maximumspeed(220);
    }
}
