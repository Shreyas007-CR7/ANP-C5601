/* Question 1.WAP to insert 7 integer values in 1D array and print them.
*/
public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = new int[7]; 
     
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        numbers[6] = 70;

        System.out.println("Array values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
/* Question 2.WAP to take two 1D array of length five and insert integer values in each. Take a third 1D array that shows the output of addition of first two arrays.
*/
public class ArrayAddition {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        
        int[] sumArray = new int[5];
      
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        System.out.println("Sum Array:");
        for (int value : sumArray) {
            System.out.println(value);
        }
    }
}
/* Question 3.WAP to take two 2D array of length five and insert integer values in each. Take a third 2D array that shows the output of addition of first two arrays.
*/
public class Array2DAddition {

    public static void main(String[] args) {
        int[][] array1 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        
        int[][] array2 = {
            {5, 4, 3, 2, 1},
            {10, 9, 8, 7, 6},
            {15, 14, 13, 12, 11},
            {20, 19, 18, 17, 16},
            {25, 24, 23, 22, 21}
        };
        
        int[][] sumArray = new int[5][5]; 
     
        for (int i = 0; i < sumArray.length; i++) {
            for (int j = 0; j < sumArray[i].length; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Sum Array:");
        for (int i = 0; i < sumArray.length; i++) {
            for (int j = 0; j < sumArray[i].length; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
           

/* Question 4.WAP to multiply two matrices of type 3x3 and print the appropriate output.
*/
public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
		
        int[][] resultMatrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
		
        System.out.println("Result Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

