package worksheet3.task1;

public abstract class PopularGrocery extends GroceryItem{
    private int popularityLevel;
    private int quantity;

    public PopularGrocery(int popularityLevel){
        super(true);
        setPopularityLevel(popularityLevel);
    }
    public PopularGrocery(int discountThreshold,int householdLimit, int popularityLevel, int quantity){
        super(discountThreshold, householdLimit, true);
        setPopularityLevel(popularityLevel);
        setQuantity(quantity);
    }

    public boolean showWarning(){
        return quantity>super.getHouseholdLimit();
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setPopularityLevel(int popularityLevel){
        this.popularityLevel=popularityLevel;
    }
    public int getPopularityLevel(){
        return popularityLevel;
    }
}

