import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class LoopTest {

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

    @Test
    @Ignore
    public void endlessLoops_() {

//        for (;;){}

        // while(true){}
        do {
        } while (true);
    }

    @Test
    @Ignore
    public void unreachableCode_afterEndlessLoops_(){

       // for (;;){}
        //while(true){}
        do {
        } while (true);
       // System.out.println("dummy");
    }

    @Test
    public void traverse_intMatrixEager_forClassicLoops_(){

        int[][] numbers = new int[2][2];

        for (int row=1; row <= numbers.length; row++) {
            for (int col = 1; col <= numbers[row].length; col++) {
                numbers[row-1][col-1] = row++;
            }
        }

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = row++;
            }
        }
    }

    @Test
    public void traverse_intMatrixEager_forEnhancedLoops_(){

        int[][] numbers = new int[2][2];

        int rowCounter = 0, colCounter = 0;

        for (int[] row:  numbers) {
            for (int col:  row) {
                numbers[rowCounter][colCounter] = colCounter++;
            }
            rowCounter++;
        }
    }

    @Test
    public void traverse_intMatrixEager_whileLoops_(){

        int[][] numbers = new int[2][2];

        int row = 0, col = 0;

        while (row < numbers.length) {

            while (col < numbers[row].length) {
                numbers[row][col] = row++;
                col++;
            }
            row++;
        }
    }

    @Test
    public void traverse_intMatrixEager_doWhileLoops_(){

        int[][] numbers = new int[2][2];
        int row = 0, col = 0;

        do {
            do {
                numbers[row][col] = row++;
                col++;
            } while (col < numbers[row].length);

            row++;
        } while (row < numbers.length);
    }

    @Test
    public void traverse_intMatrixLazy_forClassicLoops_(){

        int[][] numbers = {
                {1,1}, {1,2},
                {2,1}, {2,2}
        };
        traverseMatrix(numbers);

    }

    private void traverseMatrix(int matrix[][]) {

        int currentRow = 0;
        int expectedValue = 0;

        for (int row = 0; row < matrix.length; row++) {
            //;
            for (int col = 0; col < matrix[row].length; col++) {
                Assert.assertEquals(expectedValue, matrix[row][col]);
            }
            currentRow++;
        }
    }
}
