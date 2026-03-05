package GLAB_303_10_4;

public class Rectangle extends Shape implements Movable {
    private int x, y; //Coordinates for Movable interface

    public Rectangle(int x, int y, double width, double height) {
        this.x = x;
        this.y = y;
        super.width = width;
        super.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Rectangle of width " + width + " and height" + height);
    }
    @Override
    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }

    //Movable Implementation
    @Override
    public void moveUp() { y++; }
    public void moveDown() { y--; }
    public void moveLeft() { x--; }
    public void moveRight() { x++; }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",height=" + height + "," + super.toString() + "]";
    }
}
