abstract class A{
 abstract void run();
  //concrete method allowed in abstract classes
void drive(){
 System.out.println("driving around");
 }
}
class B extends A{
 void run(){
 System.out.println("running");
 }
}
class Demoabstract{
 public static void main(String[] args){
  B b1=new B();
  b1.run();
  b1.drive();
 }
}
