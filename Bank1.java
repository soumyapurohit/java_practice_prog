class Bank{
  String name;
  int acno;
  String type;
  double bal;
  Bank(String name,int acno,String type,double bal){
   this.name=name;
   this.acno=acno;
   this.type=type;
   this.bal=bal;
  }
  void deposit(double amount){
  if(amount>0)
   bal=bal+amount;
   
  else
   System.out.println("Invalid amount");
  }
  double withdraw(double amount){
  if(bal>amount){
   bal=bal-amount;
   return bal;
   }
  else
   return 0;
  }
//hello
 void display(){
   System.out.println("name is "+name+" balance is"+bal);
  }
}
class Bank1{
  public static void main(String[] args){
   Bank b=new Bank("Soumya",100,"savings",1000);
   b.deposit(100); 
   b.withdraw(200);
   b.display();
  }
}
  
  