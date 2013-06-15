import java.util.Scanner;
public class Vowel{
      
      public static void main(String[] args){
	 Scanner scan=new Scanner(System.in);
         String letter=scan.next();
         char alpha=letter.charAt(0);
         int count=0;
         switch(alpha){
            case 'a':
            case 'A':
            case 'E':
            case 'e':
            case 'i':
            case 'I':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                count =1;
         }
         if (count==1)
           System.out.println("It is a vowel");
         else
           System.out.println("It is not a vowel");
      }
}
