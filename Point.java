/**
 * Represents a point in a two-dimensional space.
 */
public class Point {

    /** The x coordinate of the point. */
    private int x;

    /** The y coordinate of the point. */
    private int y;

    /**
     * Creates a point with the given coordinates.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x coordinate.
     *
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x coordinate.
     *
     * @param x the new x coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns the y coordinate.
     *
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y coordinate.
     *
     * @param y the new y coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Calculates the distance from the origin (0, 0) to this point
     * using the formula sqrt(x^2 + y^2).
     *
     * @return the distance from the origin
     */
    public double distanceFromOrigin() {
        return Math.sqrt((double) x * x + (double) y * y);
    }

    /**
     * Moves the point by dx units horizontally and dy units vertically.
     * For example, (5, 3) translated by (2, 1) becomes (7, 4).
     *
     * @param dx the amount to add to x
     * @param dy the amount to add to y
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Calculates the distance between this point and another point.
     *
     * @param p the other point
     * @return the distance between this point and p
     */
    public double distance(Point p) {
        double dx = (double) p.x - x;
        double dy = (double) p.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Updates the coordinates of this point.
     *
     * @param x the new x coordinate
     * @param y the new y coordinate
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the location of the point in the format [x;y].
     *
     * @return a string such as "[7;4]"
     */
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }
}
