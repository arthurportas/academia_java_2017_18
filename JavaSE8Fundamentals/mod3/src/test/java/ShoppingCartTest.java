import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void addItem_toShoppingCart_returnItem(){

        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("item1");

        cart.add(item);
       // Assert.assertNotNull(onCart);
        Assert.assertEquals("item1", item.getName());
        Assert.assertTrue(cart.items.size() == 1);
        Assert.assertFalse(cart.items.isEmpty());
        Assert.assertEquals("item1", cart.items.get(0).getName());
    }
}
