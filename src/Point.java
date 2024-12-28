public class Point {
    private final double x;
    private final double y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distZero() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
