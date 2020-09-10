public class Fender {

    private enum FenderType {Regular, Sports, CarbonFiber}
    private enum Color {Red, Blue, Black, Silver, Green, Yellow}

    private String fenderType;
    private String fenderColor;
    private double fenderPrice;

    public Fender(String fenderType, String fenderColor) {
        this.fenderType=fenderType;
        this.fenderColor=fenderColor;
    }

    public double getFenderPrice() {
        if (fenderType=="Regular") {
            fenderPrice = 100.00;
        } else if (fenderType=="Sports") {
            fenderPrice = 200.00;
        } else if (fenderType == "Carbon Fiber") {
            fenderPrice = 1000.00;
        } else {
            fenderPrice = 0.00;
        }
        return fenderPrice;
    }

    public String getFenderType() {
        return this.fenderType;
    }

    public String getFenderColor() {
        return  this.fenderColor;
    }

    public void setFenderPrice(double fenderPrice) {
        this.fenderPrice=fenderPrice;
    }

    public void setFenderType(String fenderType) {
        this.fenderType=fenderType;
    }

    public void setFenderColor(String fenderColor) {
        this.fenderColor=fenderColor;
    }

    public String toString() {
        return "Fender=" + fenderType + ", " + "Color=" + fenderColor;
    }
}