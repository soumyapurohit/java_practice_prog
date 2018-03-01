import java.util.Scanner;
class Application{
 public static void main(String[] args){
  int no,r,rev;
  rev=0;
  Scanner in=new Scanner(System.in);
  System.out.println("enter the no");
  no=in.nextInt();
  while(no!=0){
    r=no%10;
    rev=(rev*10)+r;
    no=no/10;
   }
  System.out.println(rev);
 }
}
