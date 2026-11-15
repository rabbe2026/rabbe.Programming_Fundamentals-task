/**
 * Tests the Line class (Task 2, step 6).
 */
public class LineTest {

    public static void main(String[] args) {
        // Default constructor
        Line l1 = new Line();
        System.out.println(l1);                              // start [0;0], end [0;0]
        System.out.println("Length = " + l1.length());       // 0.0

        // Parameterized constructor
        Line l2 = new Line(new Point(0, 0), new Point(3, 4));
        System.out.println(l2);                              // start [0;0], end [3;4]
        System.out.println("Length = " + l2.length());       // 5.0

        // Setters and getters
        l2.setP1(new Point(1, 1));
        l2.setP2(new Point(4, 5));
        System.out.println(l2);                              // start [1;1], end [4;5]
        System.out.println("p1 = " + l2.getP1() + ", p2 = " + l2.getP2());
        System.out.println("Length = " + l2.length());       // 5.0
    }
}
