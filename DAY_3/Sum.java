import java.util.Scanner;
class Sum
 {
   public static void main(String args[])
   {
        int i=1,n,sum=0;
         System.out.println("Enter a number:");
       Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         while(i<=n)
         {
            sum=sum+i;
      	i++;
           }
         System.out.println("The given natural number is:"+sum);
       }
 }