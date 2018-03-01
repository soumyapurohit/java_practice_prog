import java.util.Scanner;
 class Application{
  public static void main(String [] args){
   Scanner in=new Scanner(System.in);
   float  mc,hi,disc,amt;
   int ch;
   System.out.println("enter the amount ");
   amt=in.nextInt();
   System.out.println("enter 1 for millcloth and 2 for handloom item");
   ch=in.nextInt();
   
   switch(ch){
     case 1:  
              if(amt>0 && amt<=100)
              {
                  System.out.println("no discount and amount is :" +amt);
               }
               else if(amt>=101 && amt<=200)
                {
                 mc=0.05f;
                 amt=amt-(mc * amt);
                 System.out.println("net amount is "+amt);
                }
               else if(amt>=201 && amt<=300)
               {
                 mc=0.75f;
                 amt=amt-(mc*amt);
                 System.out.println("net amount is "+amt);
               }
               else
               {
                mc=0.10f;
                amt=amt-(mc*amt);
                System.out.println("net amount is "+amt);
               }
               break;
    case 2:   
              if(amt>0 && amt<=100){
                hi=0.05f;
                amt=amt-(hi*amt);
                System.out.println("net amount is "+amt);
                }
             
              else if(amt>=101 && amt<=200)
               {
                 hi=0.75f;
                 amt=amt-(hi*amt);
                System.out.println("net amount is "+amt);
                }
               else if(amt>=201 && amt<=300)
               {
                hi=0.10f;
                amt=amt-(hi*amt);
                System.out.println("net amount is "+amt);
                }
               else
               {
                 hi=0.15f;
                 amt=amt-(hi*amt);
                 System.out.println("net amount is "+amt);
                }
                break;
  default:      System.out.println("wrong choice");
          }
     }
}
