package objects;

public class HomeAreaCalculator {

     public static void main(String[] args) {

          Rectangle room1 = new Rectangle();
          room1.setLength(50);
          room1.setWidth(25);

          double areOfRoom1 = room1.calculateArea();

          Rectangle room2 = new Rectangle(30, 75);
          double areaOfRoom2 = room2.calculateArea();

          double totalArea = areOfRoom1 + areaOfRoom2;

          System.out.println("Area for both room:" + totalArea);
     }
}
