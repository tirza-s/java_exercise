package exception;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;

public class ExceptionHandling {

     public static void main(String[] args) {
          File file = new File("resources/nonexistent.txt");
          try {
               file.createNewFile();
          } catch (IOException e) {
               System.out.println("Oops , an error has occurred !" + e.getMessage());
          } catch (InputMismatchException e) {
               System.out.println(e.getMessage());
          }
     }
}
