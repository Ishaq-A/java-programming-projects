class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangles extends Shape {
    private int width;
    private int height;

    // 1st Constructor.
    public Rectangles(int x, int y) {
        this(x, y, 0, 0); // Calls 2nd Constructor.
    }

    // 2nd Constructor.
    public Rectangles(int x, int y, int width, int height) {
        super(x, y); // Calls constructor from parent (Shape).
        this.width = width;
        this.height = height;
    }
}

