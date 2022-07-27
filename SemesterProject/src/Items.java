
public class Items {
	// Define variables
	public String Name;
	public double Quantity;
	public double Price;
	public String Brand;
	public double Year;
	public String Size;
	public String Color;
	public double Volume;
	public String Condition;
	public String Location;
	
	Items() { //Default object
		Name = "N/A";
		Quantity = 0;
		Price = 0;
		Brand = "N/A";
		Year = 0;
		Size = "N/A";
		Color = "N/A";
		Volume = 0;
		Condition = "N/A";
		Location = "N/A";
	}
	// Setters
	public void setName(String name) {
		Name = name;
	}
	public void setQuantity(double quantity) {
		Quantity = quantity;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public void setYear(double year) {
		Year = year;
	}
	public void setSize(String size) {
		Size = size;
	}
	public void setColor(String color) {
		Color = color;
	}
	public void setVolume(double volume) {
		Volume = volume;
	}
	public void setCondition(String condition) {
		Condition = condition;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
}	