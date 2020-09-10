public class Address {

    private String addressLine1, addressLine2, city, zip, state;

    public Address(String addressLine1, String addressLine2, String city, String state, String zip) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void setAddressLine1(String address) {
        this.addressLine1 = address;
    }

    public void setAddressLine2(String address) {
        this.addressLine2 = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setState(String state) {
        this.state=state;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public String getAddressLine2(){
        return this.addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public String getZip() {
        return this.zip;
    }

    public String getState() {
        return this.state;
    }
}