public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport(false, "T_01");
        AirTransport plane = new AirTransport(true,"AP02");
        LandTransport autobus = new LandTransport(true, "LA03");
        LandTransport bike = new LandTransport(false, "LB04");
        DefaultTransport ski = new DefaultTransport();
        System.out.println(transport);
        System.out.println(plane);
        System.out.println(autobus);
        System.out.println(bike);
        System.out.println(ski);
    }
}
