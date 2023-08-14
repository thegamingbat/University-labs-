class Circle extends ShapeWithArea implements BasicShape, Displayable {
    private long centerX;
    private long centerY;
    private double radius;

    public Circle(long centerX, long centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        calcArea();
    }

    public long getCenterX() {
        return centerX;
    }

    public long getCenterY() {
        return centerY;
    }

    @Override
    public double calcArea() {
        area = 3.14159 * radius * radius;
        return area;
    }

    @Override
    public void display() {
        System.out.println("Circle - Center: (" + centerX + ", " + centerY + "), Radius: " + radius
                + ", Area: " + area);
    }

    @Override
    public void displayWithPrecision(int precision) {
        System.out.println("Circle - Center: (" + centerX + ", " + centerY + "), Radius: " + radius
                + ", Area: " + String.format("%." + precision + "f", area));
    }
}
