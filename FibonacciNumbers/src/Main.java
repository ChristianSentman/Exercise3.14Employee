import java.util.Scanner;

/**
 * Created by Christian on 11/14/2016.
 */
public class Main {
    public static void main(String args[]) {
        int n1=0,n2=1,n3,i;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers: ");
        int n = scanner.nextInt();
        int fibCount = n;
        int[] fib = new int[fibCount];
        fib[0] = 0;
        fib[1] = 1;
        for(i=2; i<fibCount; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (i=0; i<fibCount; i++) {
            System.out.print(fib[i] + " ");
        }

        }
    }
