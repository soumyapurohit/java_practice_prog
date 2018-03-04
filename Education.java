import java.util.Scanner;
abstract class Staff{
  protected int code;
  protected String name;
  Staff(int code,String name){
   code=this.code;
   name=this.name;
  }
  abstract void display();
  }
class Teacher extends Staff{
  String subject,publication;

  Teacher(int code,String name,String subject,String publication){
   super(code,name);
   subject=this.subject;
   publication=this.publication;
   }
  void display(){
   System.out.println("code of a teacher is "+code+" name is "+name+" subject is "+subject+" publication is "+publication);
   }
  }
class Typist extends Staff{
  double speed;
  Typist(int code,String name,double speed){
   super(code,name);
   speed=this.speed;
   }
  void display(){
   System.out.println("typist code is "+code+" name is "+name+" speed is "+speed);
  }
}
class Officer extends Staff{
  String grade;
  Officer(int code,String name,String grade){
   super(code,name);
    name=this.name;
    grade=this.grade;
   }
 void display(){
  System.out.println("officer's name is "+name+" code is"+code+" grade is "+grade);
  }
 }
class Regular extends Typist{
  Regular(int code,String name,double speed){
   super(code,name,speed);
   }
   void display(){
    System.out.println("regular typist code is "+code+"name is "+name+" speed is "+speed);
    }
}
class Casual extends Typist{
  int wages;
  Casual(int code,String name,double speed,int wages){
   super(code,name,speed);
    wages=this.wages;
   }
  void display(){
   System.out.println("code for casual typist is"+code+" name is "+name+ "speed is "+speed+" wages is "+wages);
  }
}
public class Education{
  public static void main(String[] args){
   String ch,name,publication,grade,subject;
   int code,type,wages;
   double speed;
   Scanner scan=new Scanner(System.in);
   System.out.println("enter choice for teacher,typist,officer");
   ch=scan.next();
   switch(ch){
    case "teacher": System.out.println("enter the code,name,subject and publication");
                    code=scan.nextInt();
                    name=scan.next();
                    subject=scan.next();
                    publication=scan.nextLine();
                    Teacher te=new Teacher(code,name,subject,publication);
                    te.display();
                    break;
   case "typist": System.out.println("enter 1 for regular typist and 2 for casual");
                  type=scan.nextInt();
                  if(type==1){
                   System.out.println("enter the code,name,speed for typist");
                   code=scan.nextInt();
                   name=scan.nextLine();
                   speed=scan.nextDouble();
                   Regular r=new Regular(code,name,speed);
                   r.display();
                  } 
                  else if(type==2){
                   System.out.println("enter the code,name,speed,daily wage for typist");
                   code=scan.nextInt();
                   name=scan.nextLine();
                   speed=scan.nextDouble();
                   wages=scan.nextInt();
                   Casual c=new Casual(code,name,speed,wages);
                   c.display();
                   }
                   break;
  case "officer":System.out.println("enter the code,name,grade of officer(a,b,c,d,e)");
                 code=scan.nextInt();
                 name=scan.nextLine();
                 grade=scan.next();
                 Officer o=new Officer(code,name,grade);
                 o.display();
                 break;
 default:        System.out.println("wrong choice");
   }
 }
}