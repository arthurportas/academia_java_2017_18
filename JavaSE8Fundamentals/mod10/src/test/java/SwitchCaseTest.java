import ex10.Customer;
import org.junit.Assert;
import org.junit.Test;

public class SwitchCaseTest {

    @Test
    public void switchCase_short_examples() {

        short num = 10;

        switch (num) {
            case 10:
                Assert.assertEquals(10, num);
                break;
            default:
                Assert.fail();
        }
    }

    @Test
    public void switchCase_byte_examples() {

        byte num = 10;

        switch (num) {
            case 10:
                Assert.assertEquals(10, num);
                break;
            default:
                Assert.fail();
        }
    }

    @Test
    public void switchCase_int_examples() {

        int num = 10;

        switch (num) {
            case 10:
                Assert.assertEquals(10, num);
                break;
            default:
                Assert.fail();
        }
    }

    @Test
    public void switchCase_char_examples() {

        char character = 'A';

        switch (character) {
            case 'A':
                System.out.println("case 'A'");
                Assert.assertEquals('A', character);
                break;
            default:
                Assert.fail();
        }

        switch (character) {
            case 65:
                System.out.println("case 65");
                Assert.assertEquals('A', character);
                break;
            default:
                Assert.fail();
        }
    }

    @Test
    public void switchCase_String_examples() {

        String value = "ABC";

        switch (value) {
            case "ABC":
                Assert.assertEquals("ABC", value);
                break;
            default:
                Assert.fail();
        }
    }

    @Test
    public void switchCase_others_examples() {

        boolean flag = true;

//        switch (flag) {
//
//            case flag:
//                break;
//            default:
//                Assert.fail();
//        }

        switch (String.valueOf(flag)) {

            case "true":
                Assert.assertEquals("true", String.valueOf(flag));
                break;
            default:
                Assert.fail();
        }
    }
}
