class College{
 protected void show(){
  System.out.println("in college");
 }
}
class Student extends College{
  protected void show(){
   System.out.println("in class student");
  }
}
public class DynamicMethodDispatch2{
  public static void main(String[] args){
   College c=new Student();
   c.show();
 }
}