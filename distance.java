import java.util.Scanner;
class Application{
  public static void main(String[] args){
   Scanner input=new Scanner(System.in);
   float u,t,a,s;
   System.out.println("enter the speed,time acceleration ");
   u=input.nextFloat();
   t=input.nextFloat();
   a=input.nextFloat();
   s=u*t+(float)(a*t*t)/2;
   System.out.println("the sum is"+s);
  }
}