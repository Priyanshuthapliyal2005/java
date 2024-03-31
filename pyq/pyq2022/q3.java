import java.util.*;

class Shape {
    void calculateArea() {
        System.out.println("Area calculation not implemented for generic shape.");
    }
}

class Rectangle extends Shape {
    void calculateArea(int length, int width) {
        int area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}

class Circle extends Shape {
    void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

public class q3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        System.out.println("Enter 1 for rectangle and 2 for circle");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter length and width of rectangle");
            int length = sc.nextInt();
            int width = sc.nextInt();
            r.calculateArea(length, width);
        }
        else if(choice == 2){
            System.out.println("Enter radius of circle");
            double radius = sc.nextDouble();
            c.calculateArea(radius);
        }
        else{
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}