class Area{
int l,b;
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
 int ar(){
  return(l*b);
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
   h=10;
   }
  int vol(){
   return(l*b*h);
  }
}
class Super1{
  public static void main(String[] args){
  Volume v=new Volume();
  int area1,area2,volume1,volume2;
  Volume v1=new Volume(10,20);
  area1=v.ar();
  volume1=v.vol();
  area2=v1.ar();
  volume2=v1.vol();
  System.out.println("Area in default constructor is "+area1);
  System.out.println("Volume in default constructor is "+volume1);
  System.out.println("Area in parameterized constructor is "+area2);
  System.out.println("volume in parameterized constructor is "+volume2);
 }
}

