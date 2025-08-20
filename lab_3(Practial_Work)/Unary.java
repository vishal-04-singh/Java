import java.util.Scanner;
class Unary{

    void preadd(int x){
        int preadd = ++x;
        System.out.println("prefix increment : "+ preadd);
    }
    void postadd(int x){
        int postadd = x++;
        System.out.println("Post increment : "+ postadd);
    }
    void predec(int x){
        int predec = --x;
        System.out.println("Post increment : "+ predec);
    }
    void postdec(int x){
        int postdec = x--;
        System.out.println("Post decrement : "+ postdec);
    }

    public static void main(String[] arg){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Value of x : ");
        int x = Sc.nextInt();

        Unary U =  new Unary();
        U.preadd(x);
        U.predec(x);
        U.postadd(x);
        U.predec(x);

    }




}