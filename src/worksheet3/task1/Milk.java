package worksheet3.task1;

public class Milk extends PopularGrocery {
    public Milk(int quantity, int discountThreshold, int popularityLevel){
        super(discountThreshold, 20, popularityLevel, quantity);
    }

    public int getBulkDiscount(){
        if(getQuantity() >= getDiscountThreshold())return 12;
        return 0;
    }
}
