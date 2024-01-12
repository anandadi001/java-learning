import java.util.Scanner;

public class Practice {
    public static void main(String[] arg){

    //fizzbuzz exercise
        for(int i=0; i<5; i++)
        {
            System.out.print("Enter a number: ");
            int num = new Scanner(System.in).nextInt();
            if(num%15==0) System.out.println("FizzBuzz");
            else if(num%5==0) System.out.println("Buzz");
            else if(num%3==0) System.out.println("Fizz");
            else System.out.println(num);
        }
    }
}
