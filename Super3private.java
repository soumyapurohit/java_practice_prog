class Area{
private int l,b,h;
 Area(){
 l=0;
 b=0;
 h=0;
 System.out.println("in default constr of superclass");
 }
 Area(int l,int b){
  this.l=l;
  this.b=b;
  System.out.println("in parameterized constr with 2 arguments of superclass");
  }
 int ar(){
  return(l*b);
  }
 int vol(){
  return (l*b*h);
  }
 Area(int l,int b,int h){
   System.out.println("in parameterized constr with 3 arg of superclass");

   this.l=l;
   this.b=b;
   this.h=h;
 
 }
}
class Volume extends Area{
  int h;
  Volume(){
   super();
   h=0;
  }
  Volume(int l,int b){
  super(l,b);
  }
  Volume(int l,int b,int h){
   super(l,b,h);
   
   }
  
  }

class Super3private{
  public static void main(String[] args){
  Volume v=new Volume();
  int area1,area2,area3,volume3,volume1,volume2;
  Volume v1=new Volume(10,20);
  Volume v2=new Volume(10,20,30);
  area1=v.ar();
  volume1=v.vol();
  area2=v1.ar();
 
  
  volume3=v2.vol();
  System.out.println("Area in default constructor is "+area1);
  System.out.println("Volume in default constructor is "+volume1);
  System.out.println("Area in parameterized constructor is "+area2);

 
  System.out.println("volume in parameterized constructor of 3 args is "+volume3);
 }
}

