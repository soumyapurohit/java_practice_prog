class Area{
 int l,b;
 void setData(int l,int b){
  this.l=l;
  this.b=b;
  }
 int a(){
  return(l*b);
  }
}
class Volume extends Area{
 int h;
 void setData(int l,int b,int h){
  setData(l,b);
  this.h=h;
  }
 int v(){
  return(a()*h);
  }
}
class Density extends Volume{
 double m;
 void setData(int l,int b,int h,double m){
  setData(l,b,h);
  this.m=m;
  }
  double d(){
  return(m/v());
 }
}
class Overloading{
 public static void main(String[] args){
  Density den=new Density();
  den.setData(2,4,6,209.8);
  System.out.println("Area is "+den.a());
  System.out.println("volume is "+den.v());
  System.out.println("Density is "+den.d());
 }
} 