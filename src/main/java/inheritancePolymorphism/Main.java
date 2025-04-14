package inheritancePolymorphism;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        p.display();  // Output: [2, 3]

        ThreedPoint tp = new ThreedPoint(4, 5, 6);
        tp.display(); // Output: [4, 5, 6]
    }
}
