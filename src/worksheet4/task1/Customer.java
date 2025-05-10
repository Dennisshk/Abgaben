package worksheet4.task1;

public class Customer {
    private Profile profile;
    private int id;

    public Customer(Profile profile, int id) {
        setProfile(profile);
        setId(id);
    }
    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if(id>=0)this.id = id;
    }
}
