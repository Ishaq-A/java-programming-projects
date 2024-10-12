class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    // 1st Constructor.
    public Rectangle() {
        this(0, 0); // Calls 2nd Constructor.
    }

    // 2nd Constructor.
    public Rectangle(int width, int height) {
        this (0, 0, width, height); // Calls 3rd Constructor.
    }

    // 3rd Constructor.
    public Rectangle(int x, int y, int width, int height) {
        // Initialise variables.
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
