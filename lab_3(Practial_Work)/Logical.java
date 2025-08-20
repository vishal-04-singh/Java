import java.util.Scanner;

public class Logical {
    void andOperation(boolean x, boolean y) {
        if (x && y) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one condition is false.");
        }
    }

    void orOperation(boolean x, boolean y) {
        if (x || y) {
            System.out.println("At least one condition is true.");
        } else {
            System.out.println("Both conditions are false.");
        }
    }

    void notOperation(boolean x) {
        if (!x) {
            System.out.println("Condition is false.");
        } else {
            System.out.println("Condition is true.");
        }
    }

    public static void main(String[] args) {
        Logical log = new Logical();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first boolean value (true/false): ");
        boolean x = sc.nextBoolean();
        System.out.print("Enter second boolean value (true/false): ");
        boolean y = sc.nextBoolean();

        log.andOperation(x, y);
        log.orOperation(x, y);
        log.notOperation(x);
        log.notOperation(y);
    }
}