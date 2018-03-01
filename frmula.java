import java.util.Scanner;
 class Application{
  public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   float p,s,d,y;
   System.out.println("enter the price,depreciation and yr of service");
   p=input.nextFloat();
   
   d=input.nextFloat();
   y=input.nextFloat();
   s= p-(d*y);
   System.out.println("salvage is :"+s);
  }
}