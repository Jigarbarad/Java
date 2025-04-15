import java.util.Scanner;
public class floyds
{
   void floyd(int[][] w, int n)
   {
      int i, j, k;
      for(k=0;k<=n;k++)
      for(i=0;i<=n;i++)
      for(j=0;j<=n;j++)
      w[i][j]=Math.min(w[i][j],w[i][k]+w[k][j]);
   }   
   public static void main(String[] args)
   {
      int a[][]=new int [10][10];
      int n,i,j;
      System.out.println("Enter the no of vertices:");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("Enter the Weighted Matrix:");
      for(i=1;i<=n;i++)
       for(j=1;j<=n;j++)
        a[i][j]=sc.nextInt();

      floyds f= new floyds();
      f.floyd(a,n);
      System.out.println("The Shortest path matrix is:");
      for(i=1;i<=n;i++);
      {
         for(j=1;j<=n;j++)
         {
            System.out.println(a[i][j]+"");
         }
         System.out.println();
      }
      sc.close();

   }
}