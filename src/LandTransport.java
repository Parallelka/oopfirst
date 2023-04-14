public class LandTransport extends Transport {
    public LandTransport(boolean isMotorized, String serial) {
        super(isMotorized, serial);
    }

    @Override
    public void toTransport() {
        System.out.println("LandTransport is transporting");
    }

    @Override
    public String toString() {
        return "Landtransport: serial = " + super.getSerial() + ", isMotorized = " + super.isMotorized();
    }
}

