package worksheet4.task2;

public class Customer {
    private Profile profile;
    private int id;

    public Customer(Profile profile, int id) throws InvalidCustomerException{
        setProfile(profile);
        setId(id);
    }
    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) throws InvalidCustomerException{
        if(profile==null) throw new InvalidCustomerException("Profile");
        this.profile = profile;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) throws InvalidCustomerException{
        if(id>=0){
            this.id = id;
        } else{
            throw new InvalidCustomerException("ID");
        }
    }
}
