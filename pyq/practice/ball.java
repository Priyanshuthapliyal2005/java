class White {
    String color;

    public White(String color) {
        this.color = color;
    }

    public void printColor() {
        System.out.println("Color in White class: " + color);
    }
}

class Red extends White {
    String shade;

    public Red(String color, String shade) {
        super(color); // using super to call constructor of superclass
        this.shade = shade;
    }

    public void printColor() {
        super.printColor(); // using super to call method of superclass
        System.out.println("Color in Red class: " + color + ", Shade: " + shade);
    }

    public void displaySuperColor() {
        System.out.println("Color using super keyword in Red class: " + super.color);
    }
}

public class ball {
    public static void main(String args[]) {
        White w = new White("white");
        w.printColor(); 
        Red r = new Red("red", "dark");
        r.printColor();
        r.displaySuperColor();
    }
}
