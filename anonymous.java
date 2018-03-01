class test{
 int x=10;
 public test show(){
  System.out.println("Hey there");
  return this;
   }
 public test print(){
  System.out.println("hello");
  return this;
  }
 
 public static void main(String[] args){
  test t;

  new test().show().print();
  System.out.println(new test().x);
  new test().show();


  }
 }