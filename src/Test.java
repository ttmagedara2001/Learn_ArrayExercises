import java.util.*;

public class Test {

            public static void main (String [] args){
        int[] arr = {2001,2002,2003,2004,2005,2006};
        int[] arr_new = new int[arr.length-1];

        int index = 2005;

                System.out.println("Original Array : "+ Arrays.toString(arr));

                for(int i = 0, k=0; i<arr.length ; i++){
                    if(arr[i]!=index){
                        arr_new[k] = arr[i];
                        k++;
                    }
                }
                System.out.println("After Removing the Element : "+ Arrays.toString(arr_new));

            }
        }




