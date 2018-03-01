import java.util.Scanner;
class Application{
 public static void main(String[] args){
  int a,b,s;
  String str;
  Scanner in=new Scanner(System.in);
  System.out.println("enter 2 no");
  a=in.nextInt();
  b=in.nextInt();
  System.out.println("enter the operation you want to perform + to add,- to subtract * to multiply and / to divide ");
  str=in.next();
  switch(str)
  {
    case "+": s=a+b;
              System.out.println(s);
              break;
    case "-": s=a-b;
              System.out.println(s);
              break;
   case "*": s=a*b;
             System.out.println(s);
             break;
   case "/": s=a/b;
             System.out.println(s);
             break;
  default:   System.out.println("wrong choice");

  }
  
  }
}