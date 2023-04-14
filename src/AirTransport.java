public final class AirTransport extends Transport {
    public AirTransport(boolean isMotorized, String serial) {
        super(isMotorized, serial);
    }

    @Override
    public void toTransport() {
        System.out.println("AirTransport is transporting");
    }

    @Override
    public String toString() {
        return "Airtransport: serial = " + super.getSerial() + ", isMotorized = " + super.isMotorized();
    }
}
