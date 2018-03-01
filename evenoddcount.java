import java.util.Scanner;
class Application{
 public static void main(String[] args){
  Scanner in=new Scanner(System.in);
  int ev=0,od=0,count,i,size;
  System.out.println("enter the size of array");
  size=in.nextInt();
  int []ar=new int[size];
  System.out.println("enter the elements");
  for(i=0;i<size;i++){
   ar[i]=in.nextInt();
  }
  for(i=0;i<size;i++){
   if(ar[i] % 2==0)
     ev++;
   else
     od++;
  }
 System.out.println("even no's are :"+ev+"odd no's are"+od);
 }
}