package worksheet3.task1;

public abstract class GroceryItem extends Article{
    public boolean isPopular;

    protected GroceryItem(boolean isPopular){
        this.isPopular=isPopular;
    }
    protected GroceryItem(int discountThreshold,int householdLimit,boolean isPopular){
        super(discountThreshold, householdLimit);
        this.isPopular=isPopular;
    }
}
