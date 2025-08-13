
//write a progam to print your identity card  details using the scanner class

import java.util.Scanner;
class Carddetails{

    public static void main (String[] args){
    Scanner details = new Scanner(System.in);
    
    System.out.println("Enter Your Name : ");
    String name = details.nextLine();

    System.out.println("Enter Your Global ID : ");
    String Global_ID = details.nextLine();

    System.out.println("Enter Your School : ");
    String School = details.nextLine();

    System.out.println("Enter Your Program : ");
    String Program = details.nextLine();

    System.out.println("Enter Your batch : ");
    String batch = details.nextLine();

    System.out.println("Hello "+name+" student of UPES your school is "+School+" and your Program is "+ Program + " and Batch is " +batch);
    



}
}


