import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CarApp {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		String carModel = "";
		String carMake = "";
		double carPrice = 0.0;
		int carYear = 0;
		int input = 0;
		
		boolean valid = true;

		System.out.println("Welcome to Grand Circus Motors");
		System.out.println("*******************************");
		try {

			System.out.println("How many cars do you want to enter");
			input = scan.nextInt();

		} catch (InputMismatchException ex) {
			System.out.println("That was not a valid number. Try again!");
			scan.nextLine();
			valid = false;

		}
		

		Car[] car = new Car[input];

		

		for (int i = 0; i < car.length; i++) {

			System.out.println("Enter Car #" + (i + 1) + "'s make: ");
			carMake = scan.nextLine();
			scan.next();
			
			System.out.println("Enter Car #" + (i + 1) + "'s model: ");
			carModel = scan.nextLine();
			scan.next();
			
			System.out.println("Enter Car #" + (i + 1) + "'s year: ");
			carYear = scan.nextInt();
			
			System.out.println("Enter Car #" + (i + 1) + "'s price: ");
			carPrice = scan.nextInt();

			car[i] = new Car(carMake, carModel, carYear, carPrice);

		}
 for (Car ride : car) {
	 
	System.out.println(ride.toString());
}

scan.close();
	}
	/*
	 * private static void sortCars(List<Car> car, String Choice,int Year, int
	 * Price) {
	 * 
	 * Set<String> sorted = new TreeSet<>(); for (Car cars: car) { if
	 * (cars.getMake().equals(Choice)) { sorted.add(cars.getModel()); } } for(String
	 * cars : sorted) { System.out.println(cars); } }
	 */

}
