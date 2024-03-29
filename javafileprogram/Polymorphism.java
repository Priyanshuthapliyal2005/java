class Shape {
    public void draw() {
      System.out.println("Drawing a shape");
    }
  
    public void erase() {
      System.out.println("Erasing a shape");
    }
  }
  
  class Circle extends Shape {
    @Override
    public void draw() {
      super.draw(); // Call parent class draw method
      System.out.println("Drawing a circle");
    }
  
    @Override
    public void erase() {
      super.erase(); // Call parent class erase method
      System.out.println("Erasing a circle");
    }
  }
  
  class Triangle extends Shape {
    @Override
    public void draw() {
      super.draw(); // Call parent class draw method
      System.out.println("Drawing a triangle");
    }
  
    @Override
    public void erase() {
      super.erase(); // Call parent class erase method
      System.out.println("Erasing a triangle");
    }
  }
  
  class Square extends Shape {
    @Override
    public void draw() {
      super.draw(); // Call parent class draw method
      System.out.println("Drawing a square");
    }
  
    @Override
    public void erase() {
      super.erase(); // Call parent class erase method
      System.out.println("Erasing a square");
    }
  }
  
  public class Polymorphism {
    public static void main(String[] args) {
      // Create objects using polymorphism
      Shape shape1 = new Circle();
      Shape shape2 = new Triangle();
      Shape shape3 = new Square();
  
      // Call draw and erase methods on each shape object
      shape1.draw();
      shape1.erase();
  
      shape2.draw();
      shape2.erase();
  
      shape3.draw();
      shape3.erase();
          System.out.println("\n");
          System.out.println("********************************************************************");
          System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
          System.out.println("********************************************************************");
          System.out.println("\n");
    }
  }
  