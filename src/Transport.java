abstract class Transport {
    private final String serial;
    private boolean isMotorized;

    public Transport(boolean isMotorized, String serial) {
        this.isMotorized = isMotorized;
        this.serial = serial;
    }

    public Transport() {
        serial = "";
    }

    public String getSerial() {
        return serial;
    }

    public boolean isMotorized() {
        return isMotorized;
    }
    public abstract void toTransport();

    public void setMotorized(boolean motorized) {
        isMotorized = motorized;
    }

    @Override
    public String toString() {
        return "Transport: serial = " + serial + ", isMotorized = " + isMotorized;
    }
}
