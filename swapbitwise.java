import java.util.Scanner;
 class Application{
  public static void main(String[] args){
   int x,y;
   Scanner in=new Scanner(System.in);
   System.out.println("enter 2 no");
   x=in.nextInt();
   y=in.nextInt();
   x=x^y;
   y=x^y;
   x=x^y;
   System.out.println("x after swap is :"+x+"y after swap is "+y);
  }
}