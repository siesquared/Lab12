
public class Car {
private String make;
private String model;
private int Year;
private double Price;

	public Car() {
		super();
	
	}

	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		Year = year;
		Price = price;
	}

	public String getMake() {
		return make;
	}

	public  void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Car [make= " + make + ", model= " + model + ", Year=" + Year + ", Price= "+"$ " + Price + "]";
	}


	
	
}
