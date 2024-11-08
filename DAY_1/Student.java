import java.util.Scanner;
class Student
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
     int Sno;
     String Sname;
     Float maths ,physics,chemistry;
     Float total;
     Float saverage;
  System.out.println("Enter the number:");
   Sno=sc.nextInt();
 System.out.println("Enter the name:");
  Sname=sc.next();
 System.out.println("Enter the marks in maths:");
 maths=sc.nextFloat();
 System.out.println("Enter the marks in physics:");
 physics=sc.nextFloat();
System.out.println("Enter the marks in chemistry:");
 chemistry=sc.nextFloat();
    total= (maths+physics+chemistry);
   saverage =total/3;
  System.out.println("Given the student number is:"+Sno);
  System.out.println("Given the student name is:"+Sname);
  System.out.println("Given the student marks maths is:"+maths);
  System.out.println("Given the student marks physics is:"+physics);
  System.out.println("Given the student marks chemistryis:"+chemistry);
  System.out.println("Given the student total marks is:"+total);
  System.out.println("Given the student average marks  is:"+saverage);
  }
}


    
    
 