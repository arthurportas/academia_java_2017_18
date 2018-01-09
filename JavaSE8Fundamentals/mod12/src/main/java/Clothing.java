public abstract class Clothing extends Item {

    private double price;

    public Clothing(double price, String description) {

        super(description);
        this.price = price;
    }

    protected String display() {

        return description + " " + this.price;
    }

    public void setA(){

    }
}
