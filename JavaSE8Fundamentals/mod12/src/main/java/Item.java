import com.google.common.base.Preconditions;

public abstract class Item {

    protected String description = "UNDEFINED"; //avoid null check

    /*
     * Having 'UNDEFINED' as not allowed,
     * we should enforce display implementation
     * */
    protected abstract String display();

    public Item(String description) {
        Preconditions.checkNotNull(description,
                "Item description should not be null");
        String descTrimmed = description.trim();
        Preconditions.checkArgument(!descTrimmed.isEmpty(),
                "Item description should not be blank");

        //null checks
        //not empty
        this.description = descTrimmed;
    }

    //    protected String display() {
//
//        return description;
//    }
}
