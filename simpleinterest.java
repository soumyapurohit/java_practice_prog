import java.util.Scanner;
 class Application{
  public static void main(String[] args){
   float p,r,t;
   double si;
   Scanner in=new Scanner(System.in);
   System.out.println("enter principal,rate,time");
   p=in.nextFloat();
   r=in.nextFloat();
   t=in.nextFloat();
   si=(p*r*t)/100;
   System.out.println(si);
  }
}
   