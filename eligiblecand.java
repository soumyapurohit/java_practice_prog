import java.util.Scanner;
 class Application{
  public static void main(String[] args){
   int maths,phy,chem,total,mp;
   total=0;
   mp=0;
   Scanner in= new Scanner(System.in);
   System.out.println("enter marks in maths,physics n chemistry");
   maths=in.nextInt();
   phy=in.nextInt();
   chem=in.nextInt();
   total=maths+phy+chem;
   mp=maths+phy;
   if((maths>=60) && (phy>=50)){
      if (chem>=40){
         if(total>=200){
         System.out.println(total);

         System.out.println("eligible candidate");
        }
      }
    }
   else if(mp>=150)
   System.out.println("eligible candidiate");
    else
    System.out.println("not eligible");
  }
}
  