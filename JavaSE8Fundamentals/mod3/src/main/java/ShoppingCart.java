import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public List<Item> items = new ArrayList();

    public boolean add(Item item) {//create

        return items.add(item);
    }

    //crud
//
//    public String items(){
//
//        items.forEach(
//                i-> i.toString();
//        );
//
//    }

}
