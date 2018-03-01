import java.util.Scanner;
 class Application{
  public static void main(String[] args){
   int x,y;
   Scanner in=new Scanner(System.in);
   System.out.println("enter the value of x");
   x=in.nextInt();
   if(x>0){
    y=1;
    System.out.println("y is:"+y);
   }
  if(x==0){
   y=0;
   System.out.println("y is:"+y);
  }
 else{
  y=-1;
  System.out.println("y is:"+y);
 }
 }
}