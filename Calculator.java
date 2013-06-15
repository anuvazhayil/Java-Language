import java.util.Scanner;
public class Calculator{
   public static int add(int x,int y){
       return x+y;
   }
   public static int subtract(int x,int y){
       return x-y;
   }
   public static int multiply(int x,int y){
       return x*y;
   }
   public static void main(String[] args){
       int result=0;
       String choice;char ch;       
       System.out.println("Which operation you want to do???");
       System.out.println("Enter the operator:");
       Scanner scan=new Scanner(System.in);
       choice=scan.next();
       ch=choice.charAt(0);
       System.out.println("Enter two numbers:");
       int x=scan.nextInt();
       int y=scan.nextInt();
       switch(ch) {
         case '+':
            result=add(x,y);
            break;
         case '-':
            result=subtract(x,y);
            break;
         case '*':
            result=multiply(x,y);
            break;
       }
       System.out.println("The result is:"+result);
   }
}
 
