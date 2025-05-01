package worksheet3.task1;

public abstract class Article {

    private int discountThreshold;
    private int householdLimit;

    public abstract int getBulkDiscount();
    public abstract boolean showWarning();

    protected Article(){

    }
    protected Article(int discountThreshold,int householdLimit){
        setDiscountThreshold(discountThreshold);
        setHouseholdLimit(householdLimit);
    }

    public int getDiscountThreshold(){
        return discountThreshold;
    }
    public int getHouseholdLimit(){
        return householdLimit;
    }
    public void setDiscountThreshold(int discountThreshold){
        if(!(discountThreshold<0)){
            this.discountThreshold=discountThreshold;
        }
    }
    public void setHouseholdLimit(int householdLimit){
        if(!(householdLimit<0)){
            this.householdLimit = householdLimit;
        }
    }
}
