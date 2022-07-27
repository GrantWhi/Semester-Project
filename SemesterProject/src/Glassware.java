
public class Glassware extends Items {

	Glassware() {// Default object
		Name = "N/A";
		Quantity = 0;
		Price = 0;
		Brand = "N/A";
		Color = "N/A";
		Volume = 0;
		Condition = "N/A";
		Location = "N/A";
	}
	// Define object
	Glassware(String name, double quantity, double price, String brand, String color, double volume, String condition, String location) {
		Name = name;
		Quantity = quantity;
		Price = price;
		Brand = brand;
		Color = color;
		Volume = volume;
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
	public String getColor() {
		return Color;
	}
	public double getVolume() {
		return Volume;
	}
	public String getCondition() {
		return Condition;
	}
	public String getLocation() {
		return Location;
	}
	// Format output
	public String glasswareToString() {
		return "\n" + Name + " (Glassware Item):\n"
				+ "\tQuantity: " + Quantity + "\n"
				+ "\tPrice: " + Price + "\n"
				+ "\tBrand: " + Brand + "\n"
				+ "\tColor: " + Color + "\n"
				+ "\tVolume: " + Volume + "\n"
				+ "\tCondition: " + Condition + "\n"
				+ "\tLocation: " + Location + "\n";
	}
	
}
