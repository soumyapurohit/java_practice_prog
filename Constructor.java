class Test{
 int x,y,z;
 Test(){
  x=0;
  y=0;
 }
 Test(Test k1){
  x=k1.x;
  y=k1.y;
 }
 Test(int x,int y){
  this.x=x;
  this.y=y;
  }
 void display(){
  System.out.println("x is :"+x+" y is :"+y+" z is :"+z);
  }
}
class Constructor{
  public static void main(String[] args){
   Test t1=new Test(3,8);
   Test t2=new Test();
   Test t3=new Test(t1);
   t1.display();
   t2.display();
   t3.display();

  }
}