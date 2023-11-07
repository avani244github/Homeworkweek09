package inheritance05;

public class Truck extends Vehicle {
    public static void main(String[] args) {
        Truck c = new Truck();
        c.properties("BMW","BM0113",2010,"Desel");
        c.fuelefficiency(250,50);
        c.distancetraveled(160);
        c.maximumspeed(220);
    }
}
