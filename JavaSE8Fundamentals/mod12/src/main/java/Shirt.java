import lombok.Data;

@Data
public class Shirt extends Clothing {

    private String size;

//    public Shirt(double price) {
//        super(price);
//        this(price, "UNDEFINED");//does not compile
//    }

    public Shirt(double price, String description) {
        super(price, description);
        this.size = "UNDEFINED";
    }

    public Shirt(double price, String description, String size) {
        super(price, description);
        this.size = size;
        //super(price);//does not compile
    }

    //@Override //not mandatory
    public void setA() {
        super.setA();
    }

    public String display(){
        return super.display() + " " + this.size;
    }
}
