import java.util.Scanner;
class Week
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a; 
    System.out.println("Enter a number:");
     a=sc.nextInt();
      if(a==1)
       {
         System.out.println("it is a sunday");
         }
       else if(a==2)
       {
         System.out.println("it is a Monday");
         }
       else if(a==3)
       {
         System.out.println("it is a tuesday");
         }
       else if(a==4)
      {
         System.out.println("it is a wednesday");
         }
       else if(a==5)
      {
         System.out.println("it is a Thursday");
         }
      else if(a==6)
     {
         System.out.println("it is a friday");
         }
     else if(a==7)
    {
         System.out.println("it is a saturday");
         }
        else
        {
         System.out.println("it is a wrong choice");
         }
      }
}