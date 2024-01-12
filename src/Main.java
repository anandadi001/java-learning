import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //primitive type
        long cage = 1_2345_121_689_93L;
        double price = 10.99;
        float cost = 9.99F;
        char c = 'A';
        String name = "aditya";
//        System.out.println(name+c);


        // reference types

        Date now = new Date();
        System.out.println(now);
//        now.getTime();
//        System.out.println(now.getTime());

        //Points
        Point point1 = new Point(1,2);
        Point point2 = point1;
//        System.out.println(point2);
        point1.y = 22;
//        System.out.println(point1);
//        System.out.println(point2);


        //String
        String msg = new String("hoellow ji");
        String otherMsg = "Hello second time";
//        System.out.println(msg);
//        System.out.println(otherMsg);
//
//        //concatenation
//        System.out.println(msg+" ram ram");
//        boolean batao = msg.endsWith(" ji");
//        System.out.println(batao);
//
        msg += " \"OFBians\"";
//        System.out.println(msg.endsWith("s"));
//        System.out.println(msg.startsWith("h"));

//        System.out.println(msg.length());
//        System.out.println(msg.indexOf("OFB"));
//
//        System.out.println(msg.replace("\"", "\'"));
//        System.out.println(msg);
//        System.out.println(msg.toLowerCase(Locale.ROOT)
//        );


        //Arrays
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=11;
        numbers[4]=111;
        numbers[3]=1111;
        numbers[2]=0;
        Arrays.sort(numbers);
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));

        // parsing and casting

//        double x=1.0;
//        int y = (int)x+2;
//        System.out.println(y);
//
//        String xx = "1";
//        float yy = Float.parseFloat(xx)+2;
//        System.out.println(yy);

        //Maths

//        System.out.println(Math.round(1.5)); // gives int
//        System.out.println(Math.floor(1.5)); // gives float
//        System.out.println(Math.ceil(1.5)); // gives float
//        System.out.println(Math.random()); // gives float (0,1)

//        int ans = (int)(Math.random()*1000);
//
//        System.out.println(ans);

        //Formating Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String ans = currency.format(123456.5345984);
//        System.out.println(ans);

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String ans2 = percentage.format(91.4);
//        System.out.println(ans2);




        //Day 4
        String ans3 = NumberFormat.getPercentInstance().format(0.914);
//        System.out.println(ans3);

//        System.out.println(NumberFormat.getCurrencyInstance().format(1000000.945));



        //Cin and Cout.. reading and printing outputs

        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        // now we need to store that input in a variable
        byte age = scanner.nextByte();
//        System.out.println("your age is: "+age);
        System.out.print("Enter your name: ");
        String name1 = new Scanner(System.in).nextLine();
        System.out.println("You are a "+age+" year old "+name1);

        System.out.println(1>=2);

    }
}