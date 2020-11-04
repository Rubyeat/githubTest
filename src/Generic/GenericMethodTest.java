package Generic;

public class GenericMethodTest {
    //public static void printArray(int[] array)
    public static < E > void printArray(E [] inputArray){
       // for(int element: array)
        for(E element : inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Create two arrays of integer and character types

        Integer [] intArray = {1, 2, 3, 4, 5};
        Character [] charArray = {'A', 'E', 'I', 'O', 'U'};
        Double [] doubleArray = {1.1, 1.2, 1.3};

        //int []  intArray1= {1,2,3,4,5};

        System.out.println("IntArray Contains : ");
        printArray(intArray);
        System.out.println("\nCharArray Contains : ");
        printArray(charArray);

        printArray(doubleArray);
    }
}