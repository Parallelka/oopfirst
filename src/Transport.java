public class Transport {
    private String serial = "";
    private boolean isMotorized;

    public Transport(boolean isMotorized, String serial) {
        this.isMotorized = isMotorized;
        this.serial = serial;
    }

    public Transport() {
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public boolean isMotorized() {
        return isMotorized;
    }

    public void setMotorized(boolean motorized) {
        isMotorized = motorized;
    }

    @Override
    public String toString() {
        return "Transport: serial = " + serial + ", isMotorized = " + isMotorized;
    }
}
