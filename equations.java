import java.util.Scanner;
class Application{
 public static void main(String []args){
  Scanner input=new Scanner(System.in);
  int a,b,c,d,m,n,x1,x2,res;
  System.out.println("enter value of  a,b,c,d,m,n");
  a=input.nextInt();
  b=input.nextInt();
  c=input.nextInt();
  d=input.nextInt();
  m=input.nextInt();
  n=input.nextInt();
  res=a*d-b*c;
  if(res==0)
   System.out.println("denominator cannot be zero");
  x1=m*d-b*n/(a*d-c*d);
  x2=n*a-m*c/(a*d-c*d);
  System.out.println("x1 is "+x1);
  System.out.println("x2 is "+x2);
  }
}