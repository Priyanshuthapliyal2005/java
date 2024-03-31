class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something.");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void showType(){
        System.out.println(this.type);
    
    }
}

class Student{
    String name;
    int age;
    public void printName(){
        System.out.println(this.name);
    }
    public void showAge(){
        System.out.println(this.age);
    }

    Student(){
        System.out.println("Constructor called");
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student (Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printInfo(String name){
        System.out.println(name);
    
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

public class oops{
    public static void main(String []args){
        // Pen p1 = new Pen();
        // p1.color = "Red";
        // p1.type = "Gel";

        // Pen p2=new Pen();
        // p2.color = "Blue";
        // p2.type = "Ball";

        // p1.printColor() ; p1.showType(); 
        // p2.printColor() ; p2.showType();

        Student s1 = new Student();

        //new keyword allocate memory in heap and return address of that memory
        //s1 is reference variable
        //constructor is called when we create object of class
        //constructor is used to initialize object
        //constructor name is same as class name
        //constructor has no return type


        s1.name="Aman";
        s1.age=19;
        s1.printName();
        s1.showAge();

        Student s2 = new Student("Rahul", 20);
        s2.printName();
        s2.showAge();

        Student s3 = new Student(s2);
        s3.printName();
        s3.showAge();

        s1.printInfo(28);
        s1.printInfo("Aman");
        s1.printInfo("Aman", 28);

    }
}