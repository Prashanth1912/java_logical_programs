import java.util.Scanner;
class Circle
  {
     public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
       int radius;
       Float pi=3.14F;
       Float area;
   System.out.println("Enter the radius of the circle");
        radius=sc.nextInt();
        area=pi*radius*radius;
  System.out.println("given the radius of the circle is:"+area);
   }
}
