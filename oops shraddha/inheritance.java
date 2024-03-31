import bankp.Bank;
class Shape {
    String color;

    Shape(String color) {
        System.out.println("Shape constructor");
        this.color=color;
    }
    void showInfo() {
        System.out.println("Color: " + color);
    }
}

class Rectangle extends Shape {
    Rectangle(String color) {
        super(color);
        System.out.println("Rectangle constructor");
    }

}

class Circle extends Rectangle
 {
    Circle(String color) {
        super(color);
        System.out.println("Circle constructor");
    }
}

public class inheritance {
    public static void main(String args[]) {
        // Circle c1 = new Circle("Red");
        // c1.showInfo();
        // Rectangle r1 = new Rectangle("Green");
        // r1.showInfo();
        Bank.Account a1 = new Bank.Account();
        a1.name = "John";
    }
}
