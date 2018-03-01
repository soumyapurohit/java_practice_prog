import java.util.Scanner;
 class Application{
 public static void main(String[] args){
   int i,j,k,n;
  
   Scanner in=new Scanner(System.in);
   System.out.println("enter the number");
   n=in.nextInt();
   for(i=1;i<=n;i++){
  
    for(j=n;j>=i;j--){
     System.out.print("$");
    }
     System.out.println();
   }
}
}