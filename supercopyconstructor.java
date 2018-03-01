class Area{
private int l,b,h;
 Area(){
 l=0;
 b=0;
 System.out.println("in default constr of superclass");
 }
 Area(int l,int b){
  this.l=l;
  this.b=b;
  System.out.println("in parameterized constr of superclass");
  }
  Area(int l,int b,int h){
  this.l=l;
  this.b=b;
  this.h=h;
  }
  Area(Area ob){
  System.out.println("in copy constructor of Superclass");
  l=ob.l;
  b=ob.b;
  h=ob.h;
  }
  int ar(){
  return(l*b);
  }
  int vol(){
   return(l*b*h);
 }
}
class Volume extends Area{
  int h,w;
  Volume(){
   super();
   h=0;
   w=0;
  }
  Volume(int l,int b){
   super(l,b);
   h=10;
   }
  Volume(Volume obj){
   super(obj);
   w=40;
   }
  Volume(int l,int b,int h){
   super(l,b,h);
   w=40;
  }
}
class Supercopyconstructor{
  public static void main(String[] args){
  Volume v=new Volume();
  Volume v1=new Volume(10,20);
  Volume v2=new Volume(10,20,30);
  Volume v3=new Volume(v2);
  int area1,area2,volume2,volume3;
  area1=v1.ar();
  volume2=v2.vol();
  volume3=v3.vol();
  System.out.println("area is "+area1);
  System.out.println("volume is "+volume2);
  System.out.println("volume by copy constructor is "+volume3);

  
  
 }
}

