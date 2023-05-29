package datastructure;

import java.util.*;

public class CollectionsDemo {
     public static void main(String[] args) {
          // setDemo();
           listDemo();
          // queueDemo();
          // mapDemo();
     }
     public static void setDemo() {
          Set fruit = new HashSet<>();
          fruit.add("Ananas");
          fruit.add("Mango");
          fruit.add("Orange");
          fruit.add("Mango");

          var i = fruit.iterator();
          while (i.hasNext()){
               System.out.println(i.next());
          }

          fruit.remove("Orange");

          System.out.println("Fruit contain Orange ? " + fruit.contains("Orange"));
          System.out.println("Size " + fruit.size());


//        Doing this code bellow will throw ImmutableCollections exception
//         Set moreFruit = Set.of("Grape", "Lychee", "Cherry");
//         moreFruit.add("Blueberry");
//         System.out.println(moreFruit);

     }

     public static void listDemo() {

          List <String> fruits = new ArrayList<>();
          fruits.add("Apple");
          fruits.add("Strawberry");
          fruits.add("Banana");

          fruits.set(2, "Mellon");
          fruits.add("Apple");
          fruits.remove(3);

          //fruits.forEach(f -> System.out.println(f));

          fruits.forEach(System.out::println);

          fruits.forEach(f -> {
               f = "fruit : " + f;
               System.out.println(f);
          });

         /* for(String fruit : fruits){
               System.out.println(fruit);
          }
          */

          // System.out.println("Index 2 :" + fruits.get(2));

          //    List moreFruit = List.of("Plum");  Immutable

     }

     public static void queueDemo(){
          Queue fruits = new LinkedList();
          fruits.add("Apple");
          fruits.add("Strawberry");
          fruits.add("Banana");
          fruits.add("Apple");

          var removed = fruits.remove();
          System.out.println("Removed " + removed);

          System.out.println("Head of queue: " + fruits.peek());

          System.out.println(fruits);
     }

     public static void mapDemo(){
          Map <String , Integer> fruitCalories = new HashMap<>();
          fruitCalories.put("Mango", 35);
          fruitCalories.put("Strawberry", 50);
          fruitCalories.put("Banana", 110);
          fruitCalories.put("Grape", 75);

          fruitCalories.putIfAbsent("Strawberry", 60);
          fruitCalories.remove("Strawberry");

          fruitCalories.forEach((k, v) -> System.out.println(k +" : "+v));

         /* for(Map.Entry calorieInfo : fruitCalories.entrySet()){
               System.out.println(calorieInfo.getKey() + ": " + calorieInfo.getValue());
          }


          System.out.println(fruitCalories);
          System.out.println("Banana calories:" + fruitCalories.get("Banana"));
          System.out.println("Contains grape ? " + fruitCalories.containsKey("Grape"));

          Map immutableFruitsCalories = Map.of(
                  "Mango", 35,
                  "Strawberry", 50
          );
          */
     }
}
