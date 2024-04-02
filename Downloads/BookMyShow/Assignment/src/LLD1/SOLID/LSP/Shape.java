package LLD1.SOLID.LSP;

// Shape.java
public class Shape {
    protected double width;
    protected double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }


// Rectangle.java
public static class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        super(width, height);
    }
}

// Square.java
public static class Square extends Shape {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }


    // AreaCalculator.java
    public class AreaCalculator {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 4);
            Square square = new Square(5);

            // Calculating area of rectangle
            System.out.println("Area of rectangle: " + rectangle.getArea());

            // Calculating area of square
            System.out.println("Area of square: " + square.getArea());
        }
    }
   }
}




