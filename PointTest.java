/**
 * Tests the Point class (Task 1, steps 4 and 9).
 */
public class PointTest {

    public static void main(String[] args) {
        // Step 4: create an object and test constructor, getters, setters, distanceFromOrigin
        Point p = new Point(3, 4);
        System.out.println("p = " + p);                                     // [3;4]
        System.out.println("x = " + p.getX() + ", y = " + p.getY());       // 3, 4
        System.out.println("Distance from origin = " + p.distanceFromOrigin()); // 5.0

        p.setX(5);
        p.setY(3);
        System.out.println("After setX(5), setY(3): " + p);                // [5;3]

        // Step 9: test the newly added methods
        p.translate(2, 1);
        System.out.println("After translate(2, 1): " + p);                 // [7;4]

        Point q = new Point(1, 0);
        System.out.println("q = " + q);                                     // [1;0]
        System.out.println("Distance p to q = " + p.distance(q));          // sqrt(36+16)

        q.setLocation(10, -2);
        System.out.println("After q.setLocation(10, -2): " + q);           // [10;-2]
        System.out.println("Distance p to q = " + p.distance(q));          // sqrt(9+36)
    }
}
