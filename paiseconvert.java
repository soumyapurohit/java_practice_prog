import java.util.Scanner;
class Application{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
   
    float r,p;
    System.out.println("enter the amount in decimal");
    r=input.nextFloat();
   
    p=r*100;
    System.out.println("converted amount is: "+p);
   }
 }