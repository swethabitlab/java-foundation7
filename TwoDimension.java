import java.util.Scanner;
public class TwoDimension{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int review[][]=new int[3][4];
      System.out.println("enter the reviews");
    for(int i=0;i<review.length;i++)
      for(int j=0;j<review[i].length;j++)
        review[i][j]=s.nextInt();
    int sum=0;
   for(int i=0;i<review.length;i++){
       for(int j=0;j<review[i].length;j++)
        System.out.print(review[i][j]+ " ");
     System.out.println();
    }
   for(int i=0;i<review.length;i++){
      for(int j=0;j<review[i].length;j++)
        sum=sum+review[i][j];
       int average=sum/12;
        System.out.println("the average review is "+average);
      }
    int max=review[0][1];
       for(int i=1;i<review.length;i++){ 
         if(max==review[i][1])
           max=review[i][1];
       }
    System.out.println("the maximum review of movie1 is "+max);
  }
  }
