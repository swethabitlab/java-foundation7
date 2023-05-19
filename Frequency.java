//program to find the frequency of array elements
import java.util.Scanner;
public class Frequency{
  public static void main(String args[]){
    FrequencyElement f=new FrequencyElement();
    f.frequencyOf();
  }
} 
class FrequencyElement{
  public void frequencyOf(){
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.println("enter the length of the array");
    size=sc.nextInt();
     int array[]=new int[size];
     System.out.println("enter the elements of the array");
    for(int i=0;i<size;i++)
      array[i]=sc.nextInt();
    int count;
    System.out.println("elements\t\t count");
    boolean visited[]=new boolean[size];
     for(int i=0;i<size;i++){
       if(visited[i]==true)
         continue;
       count=1;
       for(int j=i+1;j<size;j++){
         if(array[i]==array[j]){
           count=count+1;
         visited[j]=true;
       }
     } 
     System.out.println(array[i] +"\t\t"+count);
    }   
  }
}