package decision_structure;

import java.util.Scanner;

public class GradeMessageSwitchExpression {

     public static void main(String[] args) {

          System.out.println("Enter your letter grade :");

          Scanner scanner = new Scanner(System.in);

          String grade = scanner.next();

          scanner.close();

          String message = switch (grade){

               case "A", "B" -> "Excellent job!";

              // case "B" -> "Great Job!";

               case "C" -> {
                    System.out.println("print");
                    yield "Good job!";
               }

               case "D" -> "You need to work harder !";

               default -> "Ops..Invalid grade";

          };
          System.out.println(message);
     }
}
