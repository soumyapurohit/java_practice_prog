class Test{
int h,m,s;
void setData(int h,int m,int s){
 this.h=h; 
 this.m=m;
 this.s=s;
}
void display(){
 System.out.println(" hour =" +h+ " min = " +m+ " sec =" +s);
 }
void add(Test k1,Test k2){
  h=k1.h+k2.h;
  m=k1.m+k2.m;
  s=k1.s+k2.s;
 
 
 if(s>=60){
  m=m+s/60;
  s=s%60;

 }
 if(m>=60){
 h=h+m/60;
 m=m%60;
 }



}


}
class Time{
 public static void main(String[] args){
  Test t1=new Test();
  Test t2=new Test();
  Test t3=new Test();
  t1.setData(2,30,45);
  t2.setData(4,40,55);
  t3.add(t1,t2);
  
  t1.display();
  t2.display();
  t3.display();
  }
}