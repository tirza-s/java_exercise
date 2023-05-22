package loops;

import java.util.Scanner;

public class Cashier {

     public static void main(String[] args) {

          System.out.println("Enter the number of the items:");

          Scanner scanner = new Scanner(System.in);
          int quantity = scanner.nextInt();

          double total = 0;

          for(int i = 0 ; i < quantity ; i++) {
               System.out.println("Please enter the price of the item");
               double price = scanner.nextDouble();

               total = total + price;
          }

          scanner.close();
          System.out.println("Total is: " + total);
     }
}
