import java.util.Scanner;
 class Application{
 public static void main(String[] args){
   int i,j,k,n;
   k=0;
   Scanner in=new Scanner(System.in);
   System.out.println("enter the number");
   n=in.nextInt();
   for(i=1;i<=n;i++){
    k=i;
    for(j=1;j<=i;j++){
     System.out.print(k);
    }
     System.out.println();
   }
}
}