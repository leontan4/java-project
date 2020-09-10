public class Wheelset {

    private enum WheelType {PowderCoated, PaintCoated, ClearCoated, ChromePlated, BarePolished}
    private String wheelType;
    private double wheelPrice;

    public Wheelset (String wheelType) {
        this.wheelType=wheelType;
    }

    public double getWheelPrice() {
        if(wheelType == "None") {
            wheelPrice = 0.00;
        } else {
            wheelPrice = 1299.00;
        }
        return wheelPrice;
    }

    public void setWheelPrice(double wheelPrice) {
        this.wheelPrice=wheelPrice;
    }

    public String getWheelType() {
        return this.wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType=wheelType;
    }

    public String toString() {
        return "Wheelset=" + wheelType;
    }
}