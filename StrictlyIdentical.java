//Steven Johnson
package itss;
import java.util.Scanner;

public class StrictlyIdentical {
    public static boolean equals(int[] array1, int[] array2){ //takes in two arrays to compare all elements
        for(int i = 0;i<array1.length;i++){ //for loop through length of array1
            if(array1[i]!=array2[i]){
                return false; //if any array in the i position is not equal, return false
            }
        }
        return true; //otherwise return true
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //start Scanner
        int array1[] = new int[5]; //creates array1 of size 5
        int array2[] = new int[5]; //creates array2 of size 5

        System.out.print("Enter 5 elements of list1: "); //prints to enter elements for list1
        for(int i = 0;i<5;i++){ //goes thru for loop 5 times
            array1[i] = input.nextInt(); //input ints into array1
        }

        System.out.print("Enter 5 elements of list2: "); //prints to enter elements for list2
        for(int i = 0;i<5;i++){ //goes thru for loop 5 times
            array2[i] = input.nextInt(); //input ints into array2
        }
        input.close(); //close Scanner

        if(equals(array1,array2)){ //moves to header method and compares both arrays
            System.out.println("Two lists are strictly identical."); //test 1 2 3 4 5 and 1 2 3 4 5 will return this statement
        }
        else{
            System.out.println("Two lists are not strictly identical."); //if any int is not equal it will return that they are not identical
        }
    }
}
