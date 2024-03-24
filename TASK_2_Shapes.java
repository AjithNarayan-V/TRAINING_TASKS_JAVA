interface Shape {
    double calculateArea();
}

abstract class AbstractShape implements Shape {
    protected String name;

    public AbstractShape() {
        initialize();
    }

    public AbstractShape(String name) {
        this.name = name;
        initialize();
    }

    public abstract void initialize();

    public void displayDetails() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends AbstractShape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void initialize() {
        this.name = "Circle";
        this.radius = 0.0;
    }
}

class Rectangle extends AbstractShape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void initialize() {
        this.name = "Rectangle";
        this.length = 0.0;
        this.width = 0.0;
    }
}

public class TASK_2_Shapes {
    public static void main(String[] args) {
        Circle circle = new Circle("My Circle", 5.0);
        Rectangle rectangle = new Rectangle("My Rectangle", 4.0, 3.0);

        circle.displayDetails();
        rectangle.displayDetails();
    }
}
