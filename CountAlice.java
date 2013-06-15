import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CountAlice{
  public static void main(String[] args) throws FileNotFoundException{
    int count=0;
    File Story=new File("alice.txt");
    Scanner scan= new Scanner(Story);
    String word="Alice";
    while(scan.hasNext()){
      String Tword=scan.next();
      if(word.compareTo(Tword)==0)
      count++;
    }
  System.out.println("The number of times Alice word appears in the text:"+count);
  }
}
