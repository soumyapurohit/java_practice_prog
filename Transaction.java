import java.util.Scanner;
abstract class Account{
 String custName;
 String accType;
 int accNo;
 double bal;
 Account(String custName,String accType,int accNo,double bal )
  {
   this.custName=custName;
   this.accType=accType;
   this.accNo=accNo;
   this.bal=bal;
  }

 public abstract void display();

}
class Savings extends Account{
  double rate=0,intr,amount,dep;
  Savings(String custName,String accType,int accNo,double bal,double rate,double amount,double dep){
   super(custName,accType,accNo,bal);
   this.rate=rate;
   this.amount=amount;
   this.dep=dep;
   }
  void interest(){
   intr=(bal*rate)/12;
   }
  void update(){
   bal=bal+intr;
   
   }
  void withdraw(){
    bal=bal-amount;
    
   }
 void deposit(){
   bal=bal+dep;
   
  } 
public void display(){
  System.out.println("interest is"+intr+ "balance is "+bal);
 }
 }
class Current extends Account{
 double chk;
 Current(String custName,String accType,int accNo,double bal,double chk){
  super(custName,accType,accNo,bal);
    this.chk=chk;
  }
 void check(){
  System.out.println("check isssued for "+chk);
 }
 void updateBal(){
  bal=bal-chk;
 
 }
 public void display(){
  System.out.println("balance in current account is "+bal);
 }
}
public class Transaction{
 public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  
  String custName,accType;
  int accNo;
  double bal,rate,amount,dep,chk;
  System.out.println("enter the name,type of account(savings/current),account no and bal");
  custName=scan.next();
  accType=scan.next();

  accNo=scan.nextInt();
  bal=scan.nextDouble();

  if(accType.equals("savings")){
    System.out.println("enter the rate,amount to withdraw and deposit");
    rate=scan.nextDouble();
    amount=scan.nextDouble();
    dep=scan.nextDouble();
    Savings sav=new Savings(custName,accType,accNo,bal,rate,amount,dep);
    sav.interest();
    sav.update();
    sav.withdraw();
    sav.deposit();
    sav.display();
   }
  else if(accType.equals("current")){
   System.out.println("enter the cheque amount");
   chk=scan.nextDouble();
   Current cur=new Current(custName,accType,accNo,bal,chk);
   cur.check();
   cur.updateBal();
   cur.display();
  }
 }
}
  