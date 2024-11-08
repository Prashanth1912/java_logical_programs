import java.util.Scanner;
   class Product
    {
       public static void main(String args[])
         {
  	Scanner sc=new Scanner(System.in);
     	int Pnumber;
 	String Pname;
	Float Pcost;
	Float PQuantity;

  	System.out.println("Enter the product number:");
                   Pnumber=sc.nextInt();
	System.out.println("Enter the product name:");
      	 Pname=sc.next();
	System.out.println("Enter the product cost:");
	 Pcost=sc.nextFloat();
	System.out.println("Enter the product Quantity:");
	 PQuantity=sc.nextFloat();
                   
	System.out.println("Given the Product Number:"+Pnumber);
	System.out.println("Given the Product Name:"+Pname);
	System.out.println("Given the Product cost:"+Pcost);
	System.out.println("Given the Product Quantity:"+PQuantity);
    	

	}
         }

	

	
	