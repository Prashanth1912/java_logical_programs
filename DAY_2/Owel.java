import java.util.Scanner;
class Owel
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      char ch='u';
      System.out.println("Enter an alphabet:");
       sc.next().charAt(0);
   
      if(ch=='a'|| ch=='e' ||ch=='i'||ch=='o'||ch=='u')
      {
         System.out.println("owel");
       }
    else
      {
         System.out.println("consonant");
       }
  }
}