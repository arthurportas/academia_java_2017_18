public class App {

//    public static void main(String[] args) throws Exception{
//        Utils utils = new Utils();
//
//        utils.doThis();
//        //utils.doThat();
//    }

    public static void main(String[] args) throws RuntimeException { //compiles, but not elegant
        Utils utils = new Utils();

//        try {
//            utils.doThis();
//        } catch (Exception e) {//checked
//            e.printStackTrace();
//            //throw unchecked
//            throw new RuntimeException(e.getMessage());//use apache commons, ExceptionUtils.getStackTrace
//        }
//
        //utils.doThat();

        //utils.doThis();//ok, but does not see error

//        try{
//            utils.doThis();
//        } catch (Exception e) {
//            //do something
//        }
        //or
//        try{
//            utils.doThis();
//        } catch (Throwable t) { //just in case
//            //do something
//            if(t instanceof RuntimeException) {
//                //soft
//            }
//            //panic
//        }

        try{
            utils.doThis();
        } catch (RuntimeException re) { //just in case

        } catch (Exception e) { //just in case

        }

//        try{
//            utils.doThis();
//        } catch (RuntimeException | Exception e) { //not compile, not hierarchy between catch clause
//
//        }

//        try{
//            utils.doThis();
//        } catch (Exception re) { //just in case
//
//        } catch (RuntimeException e) { //Never falls here, not compile
//
//        }

    }
}
