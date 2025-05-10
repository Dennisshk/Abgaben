package worksheet4.task2;

public class ShippingInfo {
    private String city;
    private int zip;
    private String country;

    public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException {
        setCity(city);
        setZip(zip);
        setCountry(country);
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) throws InvalidShippingInfoException {
        if(city == null || city.equals("")) throw new InvalidShippingInfoException("City is invalid");
        this.city = city;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) throws InvalidShippingInfoException{
        if(zip>=0){
            this.zip = zip;
        } else { 
            throw new InvalidShippingInfoException("Zip is invalid");
        }
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
