package Workshop;
class Address {
    private String street;
    private String city;
    private int zipCode;
    Address() {}
    Address(String street, String city, int zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    public String getStreet() { return street; }
    public String getCity() { return city; }
    public int getZipCode() { return zipCode; }
    public void setStreet(String street) { this.street = street; }
    public void setCity(String city) { this.city = city; }
    public void setZipCode(int zipCode) { this.zipCode = zipCode; }
}
public class Question11 {
    public static void main(String[] args) {
        Address obj = new Address();
        obj.setStreet("Mills Area");
        obj.setCity("Biratnagar");
        obj.setZipCode(56613);
        System.out.println("Street  : " + obj.getStreet());
        System.out.println("City    : " + obj.getCity());
        System.out.println("Zip Code: " + obj.getZipCode());
    }
}