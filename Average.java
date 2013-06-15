import java.util.Scanner;
public class Average{
  public static void main(String[] args){
     System.out.println("Enter the number of elements required:");
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     double[] array=new double[n];
     double avg,sum=0;
     for(int i=0;i<n;i++){
        array[i]=scan.nextDouble();
        sum+=array[i];
     }
     for(int i=0;i<n-1;i++)
        System.out.print(array[i]+",");
     System.out.println(array[n-1]);
     avg=sum/n;
     System.out.println("The average of the numbers is:"+avg);
  }
}
