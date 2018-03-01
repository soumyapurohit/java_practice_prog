class Area{
 int l,b,res;
 Area(){
 l=10;
 b=10;
 }
 int ar(){
  return(l*b);
 }
 
}
class Volume extends Area{
 int h,vol;
 Volume(){
 
  h=10;
 }
 int vol(){
  return(l*b*h);
 }

 }
class SimpleInheritance{
 public static void main(String[] args){
  Volume v=new Volume();
  int area =v.ar();
  int volume=v.vol();
  System.out.println("area is "+area);
  System.out.println("volume is "+volume);
  
 }
}