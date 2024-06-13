class Animal {
    String name;
  
    public Animal(String name) {
      this.name = name;
    }
  
    public void makeSound() {
      System.out.println("Generic animal sound");
    }
  }
  
  class Dog extends Animal {
    boolean isGoodBoy;
  
    public Dog(String name, boolean isGoodBoy) {
      super(name); 
      this.isGoodBoy = isGoodBoy;
    }
  
    @Override
    public void makeSound() {
      super.makeSound(); 
      System.out.println("Woof!");
    }
  
    public void accessSuperField() {
      System.out.println("My name is: " + super.name);
    }
  }
  
  public class SuperKeyword {
    public static void main(String[] args) {
      Dog dog = new Dog("Buddy", true);
      dog.makeSound(); 
      dog.accessSuperField(); 
         System.out.println("\n");
          System.out.println("********************************************************************");
          System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
          System.out.println("********************************************************************");
          System.out.println("\n");
    }
  }
  