
public class Clothing extends Items {
	
	Clothing () { //Default object
		Name = "N/A";
		Quantity = 0;
		Price = 0;
		Brand = "N/A";
		Size = "N/A";
		Color = "N/A";
		Condition = "N/A";
		Location = "N/A";
	}
	// Define object
	Clothing(String name, double quantity, double price, String brand, String size, String color, String condition, String location) {
		Name = name;
		Quantity = quantity;
		Price = price;
		Brand = brand;
		Size = size;
		Color = color;
		Condition = condition;
		Location = location;
	}

	// Getters
	public String getName() {
		return Name;
	}
	public double getQuantity() {
		return Quantity;
	}
	public double getPrice() {
		return Price;
	}
	public String getBrand() {
		return Brand;
	}
	public String getSize() {
		return Size;
	}
	public String getColor() {
		return Color;
	}
	public String getCondition() {
		return Condition;
	}
	public String getLocation() {
		return Location;
	}
	//Format output
	public String clothingToString() {
		return "\n" + Name + " (Clothing Item):\n"
				+ "\tQuantity: " + Quantity + "\n"
				+ "\tPrice: " + Price + "\n"
				+ "\tBrand: " + Brand + "\n"
				+ "\tSize: " + Size + "\n"
				+ "\tColor: " + Color + "\n"
				+ "\tCondition: " + Condition + "\n"
				+ "\tLocation: " + Location + "\n";
	}


}
