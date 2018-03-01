import java.util.Scanner;
class Test{
 int f=1,x,i;
 void getData(int a){
  x=a;
  }

void fact(){
  for(i=1;i<=x;i++){
   f=f*i;
  }
 }

void display(){
 System.out.println("factorial is "+f);
 }

}
class Factorial{
 public static void main(String[] args){
  Scanner in=new Scanner(System.in);
  Test t=new Test();
  int no;
  System.out.println("enter a no");
  no=in.nextInt();
  t.getData(no);
  t.fact();
  t.display();
  }
}
  
  