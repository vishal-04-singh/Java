import java.util.Scanner;
public class Bitwise{

    void and(int x, int y) {
        System.out.println("AND : " + (x & y));
    }

    void or(int x, int y) {
        System.out.println("OR : " + (x | y));
    }

    void xor(int x, int y) {
        System.out.println("XOR : " + (x ^ y));
    }

    void not(int x) {
        System.out.println("NOT : " + (~x));
    }


    public static void main(String[] args) {
        Bitwise bw = new Bitwise();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter second number (y): ");
        int y = sc.nextInt();

        bw.and(x, y);
        bw.or(x, y);
        bw.xor(x, y);
        bw.not(x);
    }

}
