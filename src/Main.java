public class Main {
    public static void main(String[] args) {
        AirTransport plane = new AirTransport(true, "AP02");
        LandTransport autobus = new LandTransport(true, "LA03");
        LandTransport bike = new LandTransport(false, "LB04");
        System.out.println(plane);
        plane.toTransport();
        System.out.println(autobus);
        autobus.toTransport();
        System.out.println(bike);
        bike.toTransport();
    }
}