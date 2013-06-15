import java.util.Scanner;
public class TwoDimension{
  private static int num;
  private static int[][] array;
  private static int[][] swaparray;
  
  public TwoDimension(int num){
    this.num=num; 
    array=new int[num][num];
    swaparray=new int[num][num];   
  }
  public static void insert(int n){
     System.out.println("Enter the elements:");
     Scanner scan=new Scanner(System.in);
     for(int i=0;i<n;i++)
      for(int j=0;j<n;j++)
        array[i][j]=scan.nextInt();
  }
  public static void swap(){
    for(int i=0;i<num;i++)
      for(int j=0;j<num;j++)
        swaparray[i][j]=array[j][i];  
  }
  public static void print(int arr[][]){
    for(int i=0;i<num;i++){
      for(int j=0;j<num;j++){
         System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    num=scan.nextInt();
    TwoDimension s1=new TwoDimension(num);
    s1.insert(num);
    System.out.println("Array b4 swapping");
    s1.print(array);
    s1.swap();
    System.out.println("Array after swapping");
    s1.print(swaparray);
  }
}
