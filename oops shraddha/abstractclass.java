

abstract class Animal{
    abstract public void walk();
    public void eat(){
        System.out.println("Animal is eating");
    }
    Animal(){
        System.out.println("Animal is created i.e. ");
    
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse.");
    }
    public void walk(){
        System.out.println("Horse is walking");
    }

}

class chicken extends Animal{
    public void walk(){
        System.out.println("Chicken is walking");
    }
}


public class abstractclass {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        h.eat();
        // Animal animal =new Animal();
        // animal.walk();
        //abstarct wali class sirf intialise krne ke 
        //liye bnayi jati hai 
        //isse use nhi kr skte 


    }
}
