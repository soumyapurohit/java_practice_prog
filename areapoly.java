import java.util.Scanner;
class Application{
 public static void main(String[] args)
  {
    double l,b,res;
    int ch;
    String c;
    Scanner in=new Scanner(System.in);
   
  do{
    System.out.println("enter 1 to calculate area of rectangle 2 for area of square and 3 for area of circle");
    ch=in.nextInt();
    switch(ch)
    { 
      case 1: System.out.println("enter sides of rectangle");
              l=in.nextInt();
              b=in.nextInt();
              res=l*b;
              System.out.println(res);
              break;
              
     case 2:System.out.println("enter side of a square");
            l=in.nextInt();
            res=l*l;
            System.out.println(res);
            break; 
    case 3:System.out.println("enter radius:");
           l=in.nextInt();
           res=3.14*l*l;
           System.out.println(res);
           break;
   default:System.out.println("wrong choice");
  }
  System.out.println("do you want to continue(y/n)");
  c=in.next(); 
  }while(c=="y");
 }
}