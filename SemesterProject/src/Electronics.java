
public class Electronics extends Items{

	Electronics() {//Default object
		Name = "N/A";
		Quantity = 0;
		Price = 0;
		Brand = "N/A";
		Year = 0;
		Color = "N/A";
		Condition = "N/A";
		Location = "N/A";
	}
	// Define object
	Electronics(String name, double quantity, double price, String brand, double year, String color, String condition, String location) {
		Name = name;
		Quantity = quantity;
		Price = price;
		Brand = brand;
		Year = year;
		Color = color;
		Condition = condition;
		Location = location;
	}
	
	//Getters
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
	public double getYear() {
		return Year;
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
	public String electronicToString() {
		return "\n" + Name + " (Electronic Item):\n"
				+ "\tQuantity: " + Quantity + "\n"
				+ "\tPrice: " + Price + "\n"
				+ "\tBrand: " + Brand + "\n"
				+ "\tYear: " + Year + "\n"
				+ "\tColor: " + Color + "\n"
				+ "\tCondition: " + Condition + "\n"
				+ "\tLocation: " + Location + "\n";
	}

}
