package inheritance;

import objects.Rectangle;

public class Square extends Rectangle {
     @Override
     public double calculatePerimeter(){
          return side * length;
     }

     public void print(String what){
          System.out.println("I am a " + what);
     }
}
