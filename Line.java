/**
 * Represents a line segment between two points.
 */
public class Line {

    /** The starting point of the line. */
    private Point p1;

    /** The ending point of the line. */
    private Point p2;

    /**
     * Creates a line from (0, 0) to (0, 0).
     */
    public Line() {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, 0);
    }

    /**
     * Creates a line between two points.
     *
     * @param p1 the starting point
     * @param p2 the ending point
     */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Returns the starting point.
     *
     * @return the starting point
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Sets the starting point.
     *
     * @param p1 the new starting point
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * Returns the ending point.
     *
     * @return the ending point
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Sets the ending point.
     *
     * @param p2 the new ending point
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * Calculates the length of the line between the two points.
     *
     * @return the length of the line
     */
    public double length() {
        return p1.distance(p2);
    }

    /**
     * Returns the starting and ending point of the line.
     *
     * @return a string such as "Line: start [0;0], end [3;4]"
     */
    @Override
    public String toString() {
        return "Line: start " + p1 + ", end " + p2;
    }
}
