public class Utils {

    public void doThis() {

        try {
            doThat();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("doThis throw RuntimeException");
        }
    }

    private void doThat() throws Exception { //checked

        throw new Exception("doThat throw Exception");
    }
}
