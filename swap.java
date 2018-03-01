class Application{
 int a,b,temp;
 void getData(int a1,int b1){
   a=a1;
   b=b1;
  }
 void swap(){
  temp=a;
  a=b;
  b=temp;
  }
 void display(){
  System.out.println("a = "+a+" b = "+b);
  }
 }
  class Test{
  public static void main(String[] args){
   Application a = new Application();
   a.getData(4,9);
   System.out.println("values before swap is");
   a.display();
   System.out.println("values after swap is");
   a.swap();
   a.display();
  }
}
