public class Vehicle {

    private Hood hood;
    private Fender fender;
    private Doors door;
    private Wheelset wheel;
    String vehicleMake, vehicleModel, vehicleYear;
    double totalPrice;

    public Vehicle(String vehicleMake, String vehicleModel, String year, Hood hood, Fender fender, Doors door, Wheelset wheel) {
        this.hood=hood;
        this.fender=fender;
        this.door=door;
        this.wheel=wheel;
        this.vehicleMake=vehicleMake;
        this.vehicleModel=vehicleModel;
        this.vehicleYear=year;

    }

    public double getTotalPrice() {
        totalPrice = hood.getHoodPrice() + fender.getFenderPrice() + door.getDoorPrice() + wheel.getWheelPrice();
        return totalPrice;
    }

    public String getVehicleMake() {
        return this.vehicleMake;
    }

    public String getVehicleModel() {
        return this.vehicleModel;
    }

    public String getVehicleYear() {
        return this.vehicleYear;
    }

    public Doors getDoor() {
        return door;
    }

    public Wheelset getWheel() {
        return wheel;
    }

    public Hood getHood() {
        return hood;
    }

    public Fender getFender() {
        return fender;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake=vehicleMake;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel=vehicleModel;
    }

    public void setVehicleYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public void setWheel(Wheelset wheel) {
        this.wheel=wheel;
    }

    public void setDoor(Doors door) {
        this.door=door;
    }

    public void setWheel(Fender fender) {
        this.fender=fender;
    }

    public void setHood(Hood hood) {
        this.hood=hood;
    }

    public void PrintVehicleInfo() {
        System.out.println("Make=" + vehicleMake + ", Model=" + vehicleModel + ", Year=" + vehicleYear);
        System.out.println("Needs the following: ");
        System.out.println("Hood=" + hood.getHoodType() + ", Color=" + hood.getHoodColor());
        System.out.println("Fender=" + fender.getFenderType() + ", Color=" + fender.getFenderColor());
        System.out.println("Doors Color=" + door.getDoorColor());
        System.out.println("Wheelset=" + wheel.getWheelType());
        System.out.println(" ");
    }
}