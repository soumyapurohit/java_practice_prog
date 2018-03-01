import java.util.Scanner;
class Application{
 public static void main(String []args){
  int a,b,c;
  Scanner in=new Scanner(System.in);
  System.out.println("enter 3 no to calculate largest");
  a=in.nextInt();
  b=in.nextInt();
  c=in.nextInt();
  if(a>b){
    if(a>c){
      System.out.println(a);
    }
    else{
    System.out.println(c);
    }
  }
else{
  if(b>c){
   System.out.println(b);
   }
  else{
  System.out.println(c);
  }
}
}
}