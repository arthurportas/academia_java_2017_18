import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class InheritanceTest {

    public Shirt shirt;

    @Test
    @Ignore
    public void shirt_displayFromClothing(){

        shirt = new Shirt(10.0D, null);
        Assert.assertEquals("null 10.0",shirt.display());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shirt_displayFromShirt(){

        shirt = new Shirt(10.0D, "     ");
    }

    @Test
    public void shirt_displayFromShirt_trimmed(){

        shirt = new Shirt(10.0D, "  AA   ");
        Assert.assertEquals("AA 10.0 UNDEFINED",shirt.display());

    }

    @Test
    public void shirt_displayFromShirt_trimmed2(){

        shirt = new Shirt(10.0D, "  AA BB  ");
        Assert.assertEquals("AA BB 10.0 UNDEFINED",shirt.display());
    }

    @Test
    public void shirt_displayFromShirt_threeArgsConstructor(){

        shirt = new Shirt(10.0D, null, "XL");
        Assert.assertEquals("null 10.0 XL",shirt.display());
    }


}
