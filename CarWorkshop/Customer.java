public class Customer {

    String FirstName, MiddleName, LastName, customerPhone;
    Address workAddress, homeAddress;
    Vehicle customerVehicle;

    public Customer(String FirstName, String MiddleName, String LastName, String customerPhone, Address workAddress, Address homeAddress, Vehicle customerVehicle) {
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.customerPhone = customerPhone;
        this.workAddress = workAddress;
        this.homeAddress = homeAddress;
        this.customerVehicle = customerVehicle;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public String getMiddleName() {
        return this.MiddleName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public Address getCustomerAddressHome() {
        return this.homeAddress;
    }

    public Address getCustomerAddressWork() {
        return this.workAddress;
    }

    public Vehicle getCustomerVehicle() {
        return this.customerVehicle;
    }

    public void setCustomerFirstName(String sFirst) {
        this.FirstName=sFirst;
    }

    public void setCustomerMiddleName(String sMiddle) {
        this.MiddleName=sMiddle;
    }

    public void setCustomerLastName(String sLast) {
        this.LastName=sLast;
    }

    public void setCustomerPhone(String phone) {
        this.customerPhone=phone;
    }

    public void setCustomerAddressHome(Address homeAddress) {
        this.homeAddress=homeAddress;
    }

    public void setCustomerAddressWork(Address workAddress) {
        this.workAddress=workAddress;
    }

    public void setCustomerVehicle(Vehicle customerVehicle) {
        this.customerVehicle=customerVehicle;
    }

    public void PrintCustomerInfo() {
        String hoodFormat = String.format("%.02f", customerVehicle.getHood().getHoodPrice());
        String fenderFormat = String.format("%.02f", customerVehicle.getFender().getFenderPrice());
        String doorFormat = String.format("%.02f", customerVehicle.getDoor().getDoorPrice());
        String wheelFormat = String.format("%.02f", customerVehicle.getWheel().getWheelPrice());
        String totalFormat = String.format("%.02f", customerVehicle.getTotalPrice());

        System.out.println(FirstName + " " + MiddleName + " " + LastName);
        System.out.println(homeAddress.getAddressLine1() + ", " + homeAddress.getAddressLine2());
        System.out.println(homeAddress.getCity() + ", " + homeAddress.getState() + " " + homeAddress.getZip());
        System.out.println(" ");
        System.out.println("Make: " + customerVehicle.vehicleMake);
        System.out.println("Model: " + customerVehicle.vehicleModel);
        System.out.println("Year: " + customerVehicle.vehicleYear);
        System.out.println("Customer selected the following options: ");
        System.out.println("Hood: " + customerVehicle.getHood().getHoodType() + " in " + customerVehicle.getHood().getHoodColor() + " color, Price: $" + hoodFormat);
        System.out.println("Fender: " + customerVehicle.getFender().getFenderType() + " in " + customerVehicle.getFender().getFenderColor() + " color, Price: $" + fenderFormat);
        System.out.println("Doors: " + customerVehicle.getDoor().getDoorColor() + " color, Price: $" + doorFormat);
        System.out.println("Wheelset: " + customerVehicle.getWheel().getWheelType() + ", Price: $" + wheelFormat);
        System.out.println("");
        System.out.println("Total Price: $" + totalFormat);
        System.out.println("-------------------------------------------------");
    }
}