package worksheet4.task2;

public class Profile {
    private ShippingInfo shippingInfo;

    public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException {
        setShippingInfo(shippingInfo);
    }
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }
    public void setShippingInfo(ShippingInfo shippingInfo) throws MissingShippingInfoException {
        if(shippingInfo!=null){
            this.shippingInfo = shippingInfo;
        } else {
            MissingShippingInfoException e = new MissingShippingInfoException("Invalid Shipping Info");
            throw e;
        }
    }
}
