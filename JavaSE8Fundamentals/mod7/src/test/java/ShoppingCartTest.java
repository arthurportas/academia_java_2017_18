import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void givenPattern_returnIndex(){

        String custName = "Steve Smith";

        Assert.assertTrue(custName.indexOf(" ") == 5);
    }

    @Test
    public void givenFullName_returnFirstName(){

        String custName = "Steve Smith";

        String firstName = custName.substring(0, custName.indexOf(" "));

        Assert.assertEquals("Steve", firstName);
    }

    @Test
    public void givenFullName_returnFirstName_usingCommonsLang(){

        String custName = "Steve Smith";

        String firstName = StringUtils.substring(custName, 0, custName.indexOf(" "));

        Assert.assertEquals("Steve", firstName);
    }

    @Test
    public void givenFullName_returnFirstName_removeBlankAheadUsingCommonsLang(){

        String custName = " Steve Smith";

        String custNameStripped = StringUtils.stripStart(custName, " ");

        String firstName = StringUtils.substring(custNameStripped,
                0, custNameStripped.indexOf(" "));

        Assert.assertEquals("Steve", firstName);
    }


    @Test
    public void givenFullName_rebuildIt_withStringBuilder(){

        String custName = "Steve Smith";

        String firstName = custName.substring(0, custName.indexOf(" "));

        Assert.assertEquals("Steve", firstName);

        StringBuilder sb = new StringBuilder(firstName);
        Assert.assertEquals("Steve", sb.toString());

        sb.append(" ").append("Smith");
        Assert.assertEquals("Steve Smith", sb.toString());
    }

    @Test
    public void integer_primitive_types(){

        char a = 'A';
        int res = a + 1;
        Assert.assertTrue(res == 66);

        char b = (char)res;

        Assert.assertTrue(b == 'B');
    }

    @Test
    public void forLoops_primitive_types(){

        for (byte i = 0; i < 10; i++) {}
        for (short i = 0; i < 10; i++) {}
        for (int i = 0; i < 10; i++) {}
        for (long i = 0; i < 10; i++) {}
        for (char i = 0; i < 10; i++) {}
        for (float i = 0.0F; i < 10; i = i + 0.1F) {}
        for (double i = 0; i < 10; i++) {}
    }

    @Test
    public void forNestedLoops_differentPrimitive_types(){

        for (byte i = 0; i < 10; i++) {
            for (short j = 0; i < 10; i++) {}
        }
    }

    @Test
    @Ignore
    public void forLoops_2variablesDifferentPrimitive_types(){
        //COMPILE ERROR
//        for (byte i = 0,short j = 0; i < 10; i++) {
//        }
    }
}
