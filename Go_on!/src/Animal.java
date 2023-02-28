public class Animal { 
 public void Move() { 
 System.out.println("Animal is moving"); 
 } 
} 
class Fish extends Animal { 
 public void Move() { 
 System.out.println("Fish is swimming"); 
 super.Move(); 
 } 
} 
class WalkingMammal extends Animal { 
 public void Move() { 
 System.out.println("Mammal is walking"); 
 } 
} 
class Dog extends WalkingMammal { 
 public void Bark() { 
 System.out.println("Dog is barking"); 
 } 
 public void MoveBark() { 
 Move(); 
 Bark(); 
 } 
} 
class Husky extends Dog { 
 public void Act() { 
 System.out.println("Husky is acting"); 
 super.MoveBark(); 
 } 
}