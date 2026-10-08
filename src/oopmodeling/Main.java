package oopmodeling;

/**
 * @author cepv
 * @created 10/8/2026
 */
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Circle c2 = new Circle();
        System.out.println(c1.circumference());
        System.out.println(c2.circumference());
    }
}
