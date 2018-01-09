package ex09_1_exercise;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.math.NumberUtils;

@NoArgsConstructor
public class Customer {

    private String name;
    private String ssn;
    private boolean isValid;

//    public Customer() {
//    }

    public Customer(String ssn) {
        setSsn(ssn);
    }

    public Customer(String name, String ssn) {
        this.name = name;
        setSsn(ssn);
    }

//    public Customer(String ssn, String name) {
//        this.name = name;
//        setSsn(ssn);
//    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    private void setSsn(String ssn) {

        if (checkOnlyDigitsHomeMade(ssn)) {
            this.ssn = ssn;
            isValid = true;
        }
//        if (checkOnlyDigitsHomeMadeWithNumberUtils(ssn)) {
//            this.ssn = ssn;
//            isValid = true;
//        }
//        if (checkOnlyDigitsHomeMadeWithInteger(ssn)) {
//            this.ssn = ssn;
//            isValid = true;
//        }
//        if (checkOnlyDigitsHomeMadeWithIntegerRound2(ssn)) {
//            this.ssn = ssn;
//            isValid = true;
//        }
    }

    public boolean isValid() {
        return isValid;
    }

    private boolean checkOnlyDigitsHomeMade(String ssn) {

        char[] ssnAsChar = ssn.toCharArray();

        for (char c : ssnAsChar) {
            if (c < 47 || c > 57) {
                return false;
            }
        }
        return true;
    }

    private boolean checkOnlyDigitsHomeMadeWithNumberUtils(String ssn) {

        return NumberUtils.isDigits(ssn);
    }

    private boolean checkOnlyDigitsHomeMadeWithInteger(String ssn) {

        try {
            Integer.valueOf(ssn);
            return true;
        } catch (NumberFormatException ne) {
            return false;
        }
    }

    private boolean checkOnlyDigitsHomeMadeWithIntegerRound2(String ssn) {

        try {
            Integer.parseInt(ssn);
            return true;
        } catch (NumberFormatException ne) {
            return false;
        }
    }
    // Encapsulate this class.  Make ssn read only.
    // Ensure ssn contains only digits
}
