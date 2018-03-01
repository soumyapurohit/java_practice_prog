import java.util.Scanner;
 class Application{
 public static void main(String[] args){
   int i,j,k,n;
  
   Scanner in=new Scanner(System.in);
   System.out.println("enter the number");
   n=in.nextInt();
   for(i=1;i<=n;i++){
   
     for(j=i;j<=n-1;j++){
     System.out.print(" ");
     }
    
     for(k=1;k<=i;k++){
     System.out.print(i);
    }
    System.out.println();
    
   }
  }
}
      