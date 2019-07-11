import java.util.ArrayList;

public class UsedCar {
	
	private double mileage;
	private ArrayList<Car> carLot;

	public UsedCar() {
		super();
		
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public ArrayList<Car> getCarLot() {
		return carLot;
	}

	public void setCarLot(ArrayList<Car> carLot) {
		this.carLot = carLot;
	}
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super();
		
		this.mileage = mileage;
	}
	public UsedCar(double mileage, ArrayList<Car> carLot) {
		super();
		this.mileage = mileage;
		this.carLot = carLot;
		
		
	}public void addCar(Car car) {
		carLot.add(car);
	}
	public void removeCar(Car car) {
		carLot.remove(car);

	}

	public void removeCar(int index) {
		carLot.remove(index);
	}
	
	public void listCars() {
		if (carLot.size() == 0) {
			System.out.println("\n- Time to restock -\n");
		} else {
			for (Car car : carLot) {
				System.out.println(car);
			}
		}

	}

	public void lookupCarInPosition(int position) {
	}
	
	@Override
	public String toString() {
		return "UsedCar [mileage=" + mileage + ", carLot=" + carLot + "]";
		
	}

}
