public class Hood {


    private enum HoodType {Regular, Sports, Lifted, None}
    private enum Color {Red, Blue, Black, Silver, Green, Yellow}
    private HoodType hood1, hood2, hood3, hood4;

    private String hoodType;
    private String hoodColor;
    private double hoodPrice;

    public Hood(String hoodType, String hoodColor) {
        this.hoodType = hoodType;
        this.hoodColor = hoodColor;
    }

    public double getHoodPrice() {
        if(hoodType == "Regular") {
            hoodPrice = 499.00;
        } else if(hoodType == "Lifted") {
            hoodPrice = 699.00;
        } else if(hoodType == "Sports") {
            hoodPrice = 599.00;
        } else {
            hoodPrice=0.00;
        }
        return hoodPrice;
    }

    public String getHoodType() {
        return this.hoodType;
    }

    public String getHoodColor() {
        return this.hoodColor;
    }

    public void setHoodPrice(double hoodPrice) {
        this.hoodPrice = hoodPrice;
    }

    public void setHoodType(String hoodType) {
        this.hoodType=hoodType;
    }

    public void setHoodColor(String hcolor) {
        this.hoodColor=hcolor;
    }

    public String toString() {
        return "Hood=" + this.hoodType + ", " + "Color=" + this.hoodColor + this.hoodPrice;
    }

}