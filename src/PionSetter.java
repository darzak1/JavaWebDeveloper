import java.awt.*;

public class PionSetter {
    public static void main(String[] args) {

        Point location = new Point(4,13);

        System.out.println("położenie początkowe: ");
        System.out.println("x równe: " + location.x);
        System.out.println("y równe: " + location.y);

        System.out.println("Przejście do (7, 6)");
        location.x = 7;
        location.y = 6;

        System.out.println("położenie końcowe: ");
        System.out.println("x równe: " + location.x);
        System.out.println("y równe: " + location.y);
    }
}
