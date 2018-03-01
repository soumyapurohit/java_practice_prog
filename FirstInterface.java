class student{
   int rno=10;
   String name="Soumya";
   
}
interface extras{
 final static int sports=80;
 final static int miscellaneous=89;
 }
class Marks extends student{
 int phy=90,chem=90,maths=90;
 
 void display(){
  System.out.println("physics is "+phy+"chem is "+chem+"maths is "+maths);
 }
 }
class Result extends Marks implements extras{
 void show(){
  System.out.println("sports is"+sports+"miscellaneous is "+miscellaneous);
 }
 void res(){
  display();
  }
}
class FirstInterface {
 public static void main(String[] args){
  Result r=new Result();
  r.res();
  r.show();
}
}