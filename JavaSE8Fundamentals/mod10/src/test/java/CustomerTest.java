import ex10.Customer;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void customer_names_equal_usingEquals_returnFalse(){

        Customer customer = new Customer("Arthur", "Portas");

        Assert.assertFalse(customer.getFirstName().equals(customer.getLastName()));
    }

    @Test
    public void customer_names_equal_usingEquals_returnTrue(){

        Customer customer = new Customer("Arthur", "Portas");

        Assert.assertTrue(customer.getFirstName().equals(customer.getFirstName()));
    }

    @Test
    public void customer_names_equal_usingEqualsIgnoreCase_returnTrue(){

        Customer customer = new Customer("Arthur", "Portas");

        Assert.assertFalse(customer.getFirstName().equalsIgnoreCase(customer.getLastName()));
    }

    @Test
    public void customer_names_equal_usingEquality_returnTrue(){

        Customer customer = new Customer("Arthur", "Arthur");

        Assert.assertTrue(customer.getFirstName() == customer.getFirstName());
        Assert.assertTrue(customer.getLastName() == customer.getLastName());
        Assert.assertTrue(customer.getFirstName() == customer.getLastName());

        Assert.assertTrue(
        customer.getFirstName().hashCode()
                    ==
                customer.getLastName().hashCode()
        );



        String a  = "Arthur";
        String b = "Arthur";



    }

    @Test
    public void customer_namesUsingNewString_equal_usingEquality_returnTrue(){

        Customer customer = new Customer("Arthur", new String("Arthur"));

        Assert.assertTrue(customer.getFirstName() != customer.getLastName());


        Assert.assertTrue(
                customer.getFirstName().hashCode()
                        ==
                        customer.getLastName().hashCode()
        );

    }
}
