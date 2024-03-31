interface Animal{
    int eyes=2;
    void walk();
    void eat();

}
interface Herbivore{

}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Horse is walking");
    }
    public void eat(){
        System.out.println("Horse is eating");
    }
}

public class interfacesinjava {
    public static void main(String []args){
        Horse h=new Horse();
        System.out.println("number of eyes in Horse :"+ h.eyes); //eyes is a static variable so it can be accessed by the object of the class
        h.walk();
        h.eat();
    }
}
