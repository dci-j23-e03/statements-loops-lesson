import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //expressions
        int i = 10 + 10; // a statement
        // 10 (literal) is an expression
        // 10 + 10 evaluating to a single value of 20, an expression
        // i = 10 + 10 evaluating to a single value of 20, an expression

        // empty block of code
        {

        }

        // block of code with variables
        {
            String hello = "Hello";
            System.out.println(hello);
        }

        // compile error: can not resolve symbol hello, because it is defined inside of the block, and visible only there
        // System.out.println(hello);

        // while loop
        int sum = 5;
        while (sum < 20) {
            // int k = sum--; we shouldn't decrease the sum because we are going away of 20 and will end up with infinite loop
            int k = sum++;
            String hello = "Hello again";
            System.out.println(hello + " " + k);
        }
        System.out.println("This is out of the while loop!");

        // infinite loop because we are leaving the exit condition up to the user
//        sum = 5;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the integer number greater than 5: ");
//        int exit = scanner.nextInt();
//        while (sum != exit) {
//            // int k = sum--; we shouldn't decrease the sum because we are going away of 20 and will end up with infinite loop
//            int k = sum++;
//            String hello = "Hello again";
//            System.out.println(hello + " " + k);
//        }

        // do-while loop
        sum = 5;
        do {
            // int k = sum--; we shouldn't decrease the sum because we are going away of 20 and will end up with infinite loop
            int k = sum++;
            String hello = "Hello again";
            System.out.println(hello + " " + k);
        } while (sum < 20);
    }
}