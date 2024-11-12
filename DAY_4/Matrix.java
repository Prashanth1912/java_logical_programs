import java.util.Scanner;
class Matrix
{
   public static void main(String args[])
    {
       int i,j,r,c,n=3;
        System.out.print("Enter elements to array:");
       Scanner sc=new Scanner(System.in);
          r=sc.nextInt();
          c=sc.nextInt();
      int a[][]=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
     {
        a[i][j]=sc.nextInt();
      }
  }
    System.out.println("the elements in an array");
        for(i=0;i<r;i++)
         {
          for(j=0;j<c;j++)
          {
           System.out.print(" array"+a[i][j]);
          }
         }
          System.out.println("matrix");
        }
      }
