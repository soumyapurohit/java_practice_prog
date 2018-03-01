class Test{
int f,i;
void setData(int f,int i){
 this.f=f;
 this.i=i;
 }
void add(Test k1,Test k2){
 f=k1.f+k2.f;
 i=k1.i+k2.i;
 
 if(i>=12){
  f=f+i/12;
  i=i%12;
 }
}
void display(){
 System.out.println("feet = " +f+"inches ="+i);
 }
}
class Height{
 public static void main(String[] args){
  Test t1=new Test(); 
  Test t2=new Test();
  Test t3=new Test();
  t1.setData(5,14);
  t2.setData(5,30);
  t3.add(t1,t2);
  t1.display();
  t2.display();
  t3.display();
}

}