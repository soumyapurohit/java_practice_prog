import java.util.Scanner;
 class Application{
  public static void main(String[] args){
   int x,y;
   Scanner in=new Scanner(System.in);
   System.out.println("enter the value of x");
   x=in.nextInt();
   y=((x!=0)?((x>0)?1:-1):0);
   System.out.println("y is: "+y);
  }
 }