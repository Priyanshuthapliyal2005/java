
class shape{
    void draw(){
        System.out.println("Drawing a shape.");
    }
    void erase(){
        System.out.println("Erasing a shape.");
    }
}

class circle extends shape{
    void draw(){
        System.out.println("Drawing a circle.");
    }
    void erase(){
        System.out.println("Erasing a circle.");
    }
}

class triangle extends shape{
    void draw(){
        System.out.println("Drawing a triangle.");
    }
    void erase(){
        System.out.println("Erasing a triangle.");
    }
}

class square extends shape{
    void draw(){
        System.out.println("Drawing a square.");
    }
    void erase(){
        System.out.println("Erasing a square.");
    }
}

public class run {
    public static void main(String args[])
    {
        circle c=new circle();
        c.draw();
        c.erase();
    }
}
