//WAP to find duplicate and distinct values in an array
import java.util.Scanner;
public class Duplicate{
  public static void main(String args[]){
    DuplicateElement d=new DuplicateElement();
    d.duplicateElements();
  }
}
class DuplicateElement{
  public void duplicateElements(){
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.println("enter the length of the array");
    size=sc.nextInt();
     int array[]=new int[size];
     System.out.println("enter the elements of the array");
    for(int i=0;i<size;i++)
      array[i]=sc.nextInt();
    int count;
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
    if(count>1)
      System.out.println("duplicate value of array is : "+array[i]);
       if(count==1)
          System.out.println("distinct values of array : "+array[i]);
    }   
  }
}