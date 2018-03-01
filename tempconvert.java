import java.util.Scanner;
class Application{ 
 public static void main(String []args){
  Scanner input=new Scanner(System.in);
  double f,c;
  System.out.println("enter temp in fahrenheit");
  f=input.nextFloat();
  c=(double)(f-32)/1.8;
  System.out.println("temp in celcius is :"+c);
  }
 }