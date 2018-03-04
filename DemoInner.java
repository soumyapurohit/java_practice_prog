class Outer{
 int x=100;
 void test(){
  Inner in=new Inner();
  in.display();
  }
//this is inner class
class Inner{
 void display(){
  System.out.println("outer x is "+x);
 }
}//inner closed
}//outer closed

class DemoInner{
 public static void main(String[] args){
  Outer o=new Outer();
  o.test();
 
 }
}
