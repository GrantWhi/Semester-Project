
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int condition = 1;
		double type;
		while (condition != 0) {
			//Get item type
			System.out.print("Which type of item are you adding to the list? Enter 1 for Clothing, 2 for Glassware, and 3 for Electronics."
					+ "\nEnter number: ");
			type = input.nextDouble();
			if (type == 1) { //Clothing item type was chosen
				//Get information for item
				System.out.print("\nYou chose to enter a clothing item.\n\nPlease Enter the name of the item: ");
				input.nextLine();
				String Name = input.nextLine();
				System.out.print("Please Enter the quantity of the item: ");
				double Quantity = input.nextDouble();	
				System.out.print("Please Enter the price of the item (USD): ");
				double Price = input.nextDouble();	
				System.out.print("Please Enter the brand of the item: ");
				input.nextLine();
				String Brand = input.nextLine();
				System.out.print("Please Enter the size of the item: ");
				String Size = input.nextLine();	
				System.out.print("Please Enter the color of the item: ");
				String Color = input.nextLine();	
				System.out.print("Please Enter the condition of the item: ");
				String Condition = input.nextLine();	
				System.out.print("Please Enter the location of the item: ");
				String Location = input.nextLine();	
				//Put information into object
				Clothing newItem = new Clothing(Name, Quantity, Price, Brand, Size, Color, Condition, Location);
				//Output information
				try {
					FileWriter myWriter = new FileWriter("List.txt", true);
					BufferedWriter myBuffered = new BufferedWriter(myWriter);
					myBuffered.write(newItem.clothingToString());
					myBuffered.close();
					myWriter.close();
				}
				catch (IOException e) {
					System.out.println("An error occurred.");
				}
				//Prompt more input
				System.out.print("Would you like to add another item? Enter 0 to stop adding items. Enter any other number to continue adding"
						+ " items.\nEnter number: ");
				condition = input.nextInt();
			}
			else if (type == 2) { //Glassware item type was chosen
				//Get information for item
				System.out.print("\nYou chose to enter a glassware item.\n\nPlease Enter the name of the item: ");
				input.nextLine();
				String Name = input.nextLine();
				System.out.print("Please Enter the quantity of the item: ");
				double Quantity = input.nextDouble();	
				System.out.print("Please Enter the price of the item (USD): ");
				double Price = input.nextDouble();	
				System.out.print("Please Enter the brand of the item: ");
				input.nextLine();
				String Brand = input.nextLine();	
				System.out.print("Please Enter the color of the item: ");
				String Color = input.nextLine();	
				System.out.print("Please Enter the volume of the item (fl. oz.): ");
				Double Volume = input.nextDouble();	
				System.out.print("Please Enter the condition of the item: ");
				input.nextLine();
				String Condition = input.nextLine();	
				System.out.print("Please Enter the location of the item: ");
				String Location = input.nextLine();	
				//Put information into object
				Glassware newItem = new Glassware(Name, Quantity, Price, Brand, Color, Volume, Condition, Location);
				//Output information
				try {
					FileWriter myWriter = new FileWriter("List.txt", true);
					BufferedWriter myBuffered = new BufferedWriter(myWriter);
					myBuffered.write(newItem.glasswareToString());
					myBuffered.close();
					myWriter.close();
				}
				catch (IOException e) {
					System.out.println("An error occurred.");
				}
				//Prompt more input
				System.out.print("Would you like to add another item? Enter 0 to stop adding items. Enter any other number to continue adding"
						+ " items.\nEnter number: ");
				condition = input.nextInt();
			}
			else if (type == 3) { // Electronic item type was chosen
				//Get information for item
				System.out.print("\nYou chose to enter a electronic item.\n\nPlease Enter the name of the item: ");
				input.nextLine();
				String Name = input.nextLine();
				System.out.print("Please Enter the quantity of the item: ");
				double Quantity = input.nextDouble();	
				System.out.print("Please Enter the price of the item (USD): ");
				double Price = input.nextDouble();	
				System.out.print("Please Enter the brand of the item: ");
				input.nextLine();
				String Brand = input.nextLine();	
				System.out.print("Please Enter the year of the item: ");
				Double Year = input.nextDouble();	
				System.out.print("Please Enter the color of the item: ");
				input.nextLine();
				String Color = input.nextLine();	
				System.out.print("Please Enter the condition of the item: ");
				String Condition = input.nextLine();	
				System.out.print("Please Enter the location of the item: ");
				String Location = input.nextLine();	
				//Put information into object
				Electronics newItem = new Electronics(Name, Quantity, Price, Brand, Year, Color, Condition, Location);
				//Output information
				try {
					FileWriter myWriter = new FileWriter("List.txt", true);
					BufferedWriter myBuffered = new BufferedWriter(myWriter);
					myBuffered.write(newItem.electronicToString());
					myBuffered.close();
					myWriter.close();
				}
				catch (IOException e) {
					System.out.println("An error occurred.");
				}
				//Prompt more input
				System.out.print("Would you like to add another item? Enter 0 to stop adding items. Enter any other number to continue adding"
						+ " items.\nEnter number: ");
				condition = input.nextInt();
			}
			else { //Invalid input
				System.out.print("Invalid input!!! Try agian!!!\n");
			}
		}
		System.out.print("\nThank you for using this software!");

	}

}
