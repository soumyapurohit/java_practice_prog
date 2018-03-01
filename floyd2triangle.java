import java.util.Scanner;
 class Application{
  public static void main(String[] args){
   int i,j,k=0,n;
   Scanner in=new Scanner(System.in);
   System.out.println("enter the value of n");
   n=in.nextInt();
   for(i=1;i<=n;i++){
    for(j=1;j<=i;j++) {
      if((i+j)%2==0)
        System.out.print("1");
        else
         System.out.print("0");
    }
    System.out.println();
   }
 }
}