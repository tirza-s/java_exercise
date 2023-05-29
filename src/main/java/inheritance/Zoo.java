package inheritance;

public class Zoo {
     public static void main(String[] args) {
          Dog bob = new Dog();
          //    bob.fetch();
          //    bob.makeSound();
          // feed(bob);

          Animal tosca = new Dog();
          //    tosca.makeSound();
          feed(tosca);

          tosca = new Cat();
          //    tosca.makeSound();
          //Down casting tosca to a cat
          //    ((Cat)tosca).scratch();
          feed(tosca);

     }

     public static void feed(Animal animal){
          if(animal instanceof Dog){
               System.out.println("Here is your dog food!");
          }else if(animal instanceof Cat){
               System.out.println("Here is your cat food!");
          }
     }
}
