import java.util.*;
class Harmonic
{
public static void main(String args[])
{
int n,i;
float sum=0;
n=Integer.parseInt(args[0]);
for(i=1;i<=n;i++){
  sum=sum+(float)i/n;
  }
  System.out.println("sum is: "+sum);
}
}