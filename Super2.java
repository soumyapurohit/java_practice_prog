class Area{
 int l,b;
 }
class Volume extends Area{
 int l; // this l hides the l in Area
 Volume(int a,int b){
  super.l=a;
  l=b;
  }
 void display(){
  System.out.println("l in superclass is :"+super.l);
  System.out.println("l in sub class is :"+l);
  }
}
class Super2{
 public static void main(String[] args){
  Volume v=new Volume(3,5);
  v.display();
 }
}
 