import java.util.Scanner;
 class Application{
 public static void main(String[] args){
  int row,column,y;
  System.out.println("Multiplication table");
  row=1;
  do{
   column=1;
   do{
     y=row*column;
     System.out.print(" "+y);
     column++;
     }while(column<4);
   System.out.println();
   row++;
  }while(row<4);
 }
}