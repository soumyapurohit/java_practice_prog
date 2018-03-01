import java.util.Scanner;
class Application{
 public static void main(String[] args){
  float dr,sc,hc,eoq,tbo;
  Scanner input=new Scanner(System.in);
  System.out.println("enter the demand rate,setup cost,holding cost");
  dr=input.nextFloat();
  sc=input.nextFloat();
  hc=input.nextFloat();
  eoq=(float)(2*dr*sc*hc)/hc;
  tbo=(float)2*sc/(dr*hc);
  System.out.println("eoq is"+Math.sqrt(eoq));
  System.out.println("tbo is "+Math.sqrt(tbo));
 }
}