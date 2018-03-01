import java.util.Scanner;
class Application{
 public static void main(String []args){
  Scanner input=new Scanner(System.in);
  double r;
  System.out.println("enter a real no");
  r=input.nextFloat();
  System.out.print("smallest no"+Math.floor(r));
  System.out.print("no is \t"+r);
  System.out.print("greatest no :"+Math.ceil(r));
  }
}