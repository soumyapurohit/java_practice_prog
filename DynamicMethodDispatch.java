class A{
 void m1(){
  System.out.println("in class a ");
 }
}
class B extends A{
 void m1(){
  System.out.println("in class B");
 }
}
class C extends A{
 void m1(){
  System.out.println("in class C");
 }
}
public class DynamicMethodDispatch{
 public static void main(String[] args){
   
 A a1=new A();
 B b1=new B();
 C c1=new C();
 A ref;
//reference refers to a object
 ref=a1;
//calling method of a
 ref.m1();
//reference refers to b object
 ref=b1;
//calling method of b
 ref.m1();
//reference refers to c object
 ref=c1;
//calling method of c
 ref.m1();
 }
}
 