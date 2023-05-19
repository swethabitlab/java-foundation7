//program to find unique elements in array
import java.util.Scanner;
public class Unique{
  public static void main(String args[]){
    UniqueElement un=new UniqueElement();
    un.uniqueElements();
  }
}
class UniqueElement{
  public void uniqueElements(){
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
    if(count==1)
      System.out.println("unique value of array : "+array[i]);
    }   
  }
}
