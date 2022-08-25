import java.util.Scanner;
  
  public class Car
  
  {
     public static void main(String[]args)
	 {
		     Scanner input = new Scanner(System.in);
	         System.out.print("Enter the driving distance:");
			 double distance = input.nextDouble();
			 System.out.print("Enter miles per gallon:");
			 double milesPerGallon = input.nextDouble();
			 System.out.print("Enter Price per gallon:");
			 double pricePerGallon = input.nextDouble();
			 
			 
			 double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
			 
			 
			 System.out.print("The cost of driving is $" + costOfDriving);
			 
	 }
	 
	 
   }