class a{
 int x,y;
 a(){
  this(5);
  }
 a(int x){
  this (5,10);
 }
a(int x,int y){
  this.x=x;
  this.y=y;
 }
 void display(){
 System.out.println("X is "+x+" y is :"+y);
 }
}
class Chaining{
 public static void main(String[] args){
  a a1=new a();
  a1.display();
 }
}