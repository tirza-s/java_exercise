package loops;

import java.util.Scanner;

public class AddNumbers {

     public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
          boolean again;

          do{
               System.out.println("Enter first number:");
               double num1 = scanner.nextDouble();

               System.out.println("Enter second number:");
               double num2 = scanner.nextDouble();

               System.out.println("Sum " + (num1 + num2));

               System.out.println("Would you like to run again ? false for No - true for Yes");
               again = scanner.nextBoolean();
          }while (again);
     }
}
