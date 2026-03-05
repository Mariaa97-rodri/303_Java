package GLAB_303_10_4;

public class Triangle extends Shape implements Movable {
    private int x, y;

    public Triangle(int x, int y, double base, double height) {
        this.x = x;
        this.y = y;
        super.base = base;
        super.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a Triangle of base " + base + " and height " + height);
    }

    @Override
    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }

    // Movable Implementation
    @Override
    public void moveUp() { y++; }
    @Override
    public void moveDown() { y--; }
    @Override
    public void moveLeft() { x--; }
    @Override
    public void moveRight() { x++; }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }
}
