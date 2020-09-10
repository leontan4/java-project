public class Main {

    public static void main(String[] args) {

        Hood hoodType = new Hood("Lifted", "Silver");
        Fender fenderType = new Fender("Carbon Fiber", "Black");
        Wheelset wheelset = new Wheelset("Paint-coated");
        Doors doors = new Doors("Black");
        Vehicle vehicle = new Vehicle("Tesla", "Model 3", "2019", hoodType, fenderType, doors, wheelset);
        Address homeAddress = new Address("12345 Good Ave", "Number 1", "Hastings", "MN", "55022");
        Address workAddress = new Address("", "", "", "", "");
        Customer customer = new Customer("Syed", "Ali", "Naqvi", "(999) 999-999", workAddress,homeAddress, vehicle);
        vehicle.PrintVehicleInfo();
        customer.PrintCustomerInfo();

        hoodType = new Hood("None", "no color option");
        fenderType = new Fender("Carbon Fiber", "Black");
        wheelset = new Wheelset("Powder-coated");
        doors = new Doors("Yellow");
        vehicle = new Vehicle("Ford", "F150", "2016", hoodType, fenderType, doors, wheelset);
        homeAddress = new Address("499 Apple Street", "", "Eagan", "MN", "55123");
        workAddress = new Address("", "", "", "", "");
        customer = new Customer("Gloria", "J", "Redford", "(888) 888-8888", workAddress,homeAddress, vehicle);
        vehicle.PrintVehicleInfo();
        customer.PrintCustomerInfo();
    }
}