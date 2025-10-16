//Import the Arrays class frm the java.util package.
import java.util.*;

//Define a class named Test.
public class Test {

    //The main method where the program execution starts.
            public static void main (String [] args){
                //Declare and initialize an integer array names "arr".
        int[] arr = {2001,2002,2003,2004,2005,2006};
        int[] arr_new = new int[arr.length-1];

        //Define the index of the element to be removed.
        int index = 2005;

                System.out.println("Original Array : "+ Arrays.toString(arr));

                //Loop to remove the element
                for(int i = 0, k=0; i<arr.length ; i++){
                    if(arr[i]!=index){
                        arr_new[k] = arr[i];
                        k++;
                    }
                }
                //Print the modified array after removing the element.
                System.out.println("After Removing the Element : "+ Arrays.toString(arr_new));

            }
        }

//


