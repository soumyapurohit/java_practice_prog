import java.util.*;
class Harmonic
{
public static void main(String args[])
{
int n,i;
float sum=0;
Scanner input=new Scanner(System.in);
System.out.println("enter a no upto which u want to calculate");
n=input.nextInt();

for(i=1;i<=n;i++){
  sum=sum+(float)1/i;
  }
  System.out.println("sum is: "+sum);
}
}