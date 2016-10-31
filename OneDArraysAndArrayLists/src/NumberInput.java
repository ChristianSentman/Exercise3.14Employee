import java.util.Scanner;

/**
 * Created by Christian on 10/29/2016.
 */
public class NumberInput {

   public static void main(String args[]) {

       int [] myArray;
       int value;


       myArray = new int[10];
       Scanner in = new Scanner(System.in);


       for (int i = 0; i < 10; i++) {
           System.out.print("Input integer number" + (i + 1) + ":");
           int num = in.nextInt();
           myArray[i] = num;

       }
       for (int i = 0; i < myArray.length - 1; i++)
       {
           if(myArray[i] > myArray[i+1])
           {
               value=myArray[i];
               myArray[i]=myArray[i+1];
               myArray[i+1]=value;
               i=-1;
           }
       }
       for (int i = 0; i < 10; i++) {
           System.out.print(myArray[i] + " ");

       }


   }

}

