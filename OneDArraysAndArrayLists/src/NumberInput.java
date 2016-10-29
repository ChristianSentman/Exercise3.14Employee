import java.util.Scanner;

/**
 * Created by Christian on 10/29/2016.
 */
public class NumberInput {

   public static void main(String args[]) {
       int firstNumber;
       int secondNumber;
       int thirdNumber;
       int fourthNumber;
       int fifthNumber;
       int sixthNumber;
       int seventhNumber;
       int eighthNumber;
       int ninthNumber;
       int tenthNumber;

       Scanner in = new Scanner(System.in);

       System.out.println("Enter first Number: ");
       firstNumber = in.nextInt();
       System.out.println("Enter second Number: ");
       secondNumber = in.nextInt();
       System.out.println("Enter third Number: ");
       thirdNumber = in.nextInt();
       System.out.println("Enter fourth Number: ");
       fourthNumber = in.nextInt();
       System.out.println("Enter fifth Number: ");
       fifthNumber = in.nextInt();
       System.out.println("Enter sixth Number: ");
       sixthNumber = in.nextInt();
       System.out.println("Enter seventh Number: ");
       seventhNumber = in.nextInt();
       System.out.println("Enter eighth Number: ");
       eighthNumber = in.nextInt();
       System.out.println("Enter ninth Number: ");
       ninthNumber = in.nextInt();
       System.out.println("Enter tenth Number: ");
       tenthNumber = in.nextInt();

       System.out.println("numbers are:" + firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber + seventhNumber + eighthNumber + ninthNumber + tenthNumber);

   }

}
