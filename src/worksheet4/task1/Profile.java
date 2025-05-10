package worksheet4.task1;

public class Profile {
    private ShippingInfo shippingInfo;

    public Profile(ShippingInfo shippingInfo) {
        setShippingInfo(shippingInfo);
    }
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }
    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }
}
