package objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
     private Scanner scanner = new Scanner(System.in);
     public static void main(String[] args) {

          HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
          Rectangle room1 = calculator.getRoom();
          Rectangle room2 = calculator.getRoom();
          double totalArea = calculator.calculateAreaOfRooms(room1,room2);
          System.out.println("Area for both room:" + totalArea);
     }

     public Rectangle getRoom(){
          System.out.println("Enter the length of the room:");
          double length = scanner.nextDouble();

          System.out.println("Enter the width of the room:");
          double width = scanner.nextDouble();

          return new Rectangle(length,width);
     }

     public double calculateAreaOfRooms(Rectangle room1, Rectangle room2){
          return room1.calculateArea() + room2.calculateArea();
     }
}
