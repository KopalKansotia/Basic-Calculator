import java.util.Scanner;
public class Main {

    static double a, b;
    static int c; // 1

    static double add(double x, double y) {  // 3

        return x + y;

    }

    static double sub(double x, double y) {  // 3

        return x - y;

    }

    static double div(double x, double y) {  // 3

        return x / y;

    }

    static double mul(double x, double y) {  // 3

        return x * y;

    }

    public static void main(String[] args) { // 2
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number.");
        a = input.nextDouble();
        System.out.println();
        System.out.println("____________________________________________________________________________________");

        System.out.println("Enter second number.");
        b = input.nextDouble();
        System.out.println();
        System.out.println("____________________________________________________________________________________");


        System.out.println("Enter your operation. You have the following options. Choose a number from 1 - 4.");
        System.out.println();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println();
        System.out.println("____________________________________________________________________________________");


        c = input.nextInt();
        switch (c){

            case 1 :
                System.out.println(a + " plus " + b + " is equal to " + add(a,b));
                break;

            case 2 :
                System.out.println(a + " minus " + b + " is equal to " + sub(a,b));
                break;

            case 3 :
                System.out.println(a + " times " + b + " is equal to " + mul(a,b));
                break;

            case 4 :
                System.out.println(a + " divided by " + b + " is equal to " + div(a,b));
                break;

        }

    }

}




