import ex09_1_exercise.Customer;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void customer_ssn_onlyDigits_returnTrue(){

        Customer customer = new Customer("123");
        Assert.assertTrue(customer.isValid());
    }

    @Test
    public void customer_ssn_onlyAlpha_returnFalse(){

        Customer customer = new Customer("abc");
        Assert.assertFalse(customer.isValid());
    }

    @Test
    public void customer_ssn_onlyAlphaNum_returnFalse(){

        Customer customer = new Customer("abc123");
        Assert.assertFalse(customer.isValid());
    }
}
