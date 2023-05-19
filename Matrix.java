//program to find addition of two matrices
import java.util.Scanner;
public class Matrix{
  public static void main(String args[]){
    MatrixAdd m=new MatrixAdd();
    m.addition();
  }
}
class MatrixAdd{
  public void addition(){
    Scanner sc=new Scanner(System.in);
      System.out.println("enter the no of rows for A matrix");
    int m=sc.nextInt();
    System.out.println("enter the no of  columns for A matrix");
    int n=sc.nextInt();
    int A[][]=new int[m][n];
    System.out.println("enter the no of rows for B matrix");
    int p=sc.nextInt();
    System.out.println("enter the no of  columns for B matrix");
    int q=sc.nextInt();
    int B[][]=new int[p][q];
    int result[][]=new int[p][q];
    System.out.println("enter the A matrix elements:");
    for(int i=0;i<m;i++)
      for(int j=0;j<n;j++){
        A[i][j]=sc.nextInt();
      }
    System.out.println("enter the B matrix elements:");
    for(int i=0;i<p;i++)
      for(int j=0;j<q;j++){
        B[i][j]=sc.nextInt();
      }
    if(m==p && n==q){
     for(int i=0;i<p;i++){
      for(int j=0;j<q;j++){
        result[i][j]=A[i][j]+B[i][j];
       }
      }
    }
    for (int i = 0; i <p; i++){
      for(int j=0;j<q;j++)
        System.out.print(result[i][j]+" ");
      System.out.println();
    }
    
  }
}