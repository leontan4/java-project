public class Doors {

    private enum Color {Red, Blue, Black, Silver, Green, Yellow}

    private String doorColor;
    private double doorPrice;

    public Doors(String doorColor) {
        this.doorColor=doorColor;
    }

    public double getDoorPrice() {

        return doorPrice = 599.0;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorPrice(double doorPrice) {
        this.doorPrice=doorPrice;
    }
    public void setDoorColor(String doorColor) {
        this.doorColor=doorColor;
    }

    public String toString() {
        return "Doors Color=" + this.doorColor;
    }
}