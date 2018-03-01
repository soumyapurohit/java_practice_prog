class Area{
 int l,b;
 Area(int l,int b){
  this.l=l;
  this.b=b;
 }
 Area(Area a){
  l=a.l;
  b=a.b;
 }
 void display(){
 System.out.println("l is "+l+"b is :"+b);
 }
}
class CopyConstructor{
 public static void main(String[] args){
  Area a1=new Area(4,9);
  Area a3=new Area(a1);
  a3.display();
  Area a4=a3;
  a3.display();
 }
}