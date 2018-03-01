import java.util.Scanner;
class Application{
 public static void main(String[] args){
  Scanner in=new Scanner(System.in);
  int size;
  System.out.println("enter the size");
  size=in.nextInt();
  int []marks=new int[size];

  int c1,c2,c3,c4,i;
  c1=c2=c3=c4=0;
  for(i=0;i<size;i++){
   System.out.println("enter the marks ");
   marks[i]=in.nextInt();
   if((marks[i]>81) &&(marks[i]<100))
    c1++;
   else if((marks[i]>61)&& (marks[i]<80))
    c2++;
   else if((marks[i]>41) && (marks[i]<60))
    c3++;
   else
    c4++;
   }
    System.out.println("students between 81 and 100 are"+c1);
     System.out.println("students between 61 to 80 are"+c2);
     System.out.println("students between 41 to 60 are"+c3);
      System.out.println("students between 0 to 40 are"+c4);
 }
}