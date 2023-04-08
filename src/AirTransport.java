public class AirTransport extends Transport {
    protected AirTransport(boolean isMotorized, String serial) {
        super(isMotorized, serial);
    }

    @Override
    public String toString() {
        return "Airtransport: serial = " + super.getSerial() + ", isMotorized = " + super.isMotorized();
    }
}
