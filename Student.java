import java.util.Scanner;

class Student{    
    int sp = 590028039;
    String nm = "vishal";
    void display(){
        System.out.println("My SP Id is " +sp+" and my name is "+nm);
    }
    void detail(){
        Scanner SC = new Scanner(System.in) ;
        System.out.println("Enter the first number : ");
        int X= SC.nextInt();
        System.out.println("Enter the Second number : ");
        int Y= SC.nextInt();
        System.out.println("Sum of the 2 Number X & Y : "+(X+Y)) ;
       
    }
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
        obj.detail();
    }
}


