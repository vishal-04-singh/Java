import java.util.Scanner;
public class Relational {
    
    void lessthan(int x,int y){
        if (x < y) {
            System.out.println(x + " is less than " + y);
        } else {
            System.out.println(x + " is not less than " + y);
        }
    }
    void greaterthan(int x,int y){
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(x + " is not greater than " + y);
        }
    }
    void equal(int x,int y){  
        if (x == y) {
            System.out.println(x + " is equal to " + y);
        } else {
            System.out.println(x + " is not equal to " + y);
        }
    }
    void notequal(int x,int y){
        if (x != y) {
            System.out.println(x + " is not equal to " + y);
        } else {
            System.out.println(x + " is equal to " + y);
        }
    }
    void greaterthanorequal(int x,int y){
        if (x >= y) {
            System.out.println(x + " is greater than or equal to " + y);
        } else {
            System.out.println(x + " is not greater than or equal to " + y);
        }
    }
    void lessthanorequal(int x,int y){  
        if (x <= y) {
            System.out.println(x + " is less than or equal to " + y);
        } else {
            System.out.println(x + " is not less than or equal to " + y);
        }
    }

    public static void main(String[] args) {
        Relational rel = new Relational();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter second number (y): ");
        int y = sc.nextInt();

        rel.lessthan(x, y);
        rel.greaterthan(x, y);
        rel.equal(x, y);
        rel.notequal(x, y);
        rel.greaterthanorequal(x, y);
        rel.lessthanorequal(x, y);
    }
}