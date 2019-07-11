import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {
	static Scanner scan = new Scanner(System.in);

	private static void fillList(List<Car> carList) {

		carList.add(new Car("Honda", "Civic", 2019, 30000.00));
		carList.add(new Car("Acura", "MDX", 2019, 55000.00));
		carList.add(new Car("Honda", "Accord", 2019, 31000.00));
		//carList.add(new UsedCar("Ford", "Fusion", 2009, 3000.00, 125.1));
		//carList.add(new UsedCar("Ford", "Shelby Mustang", 1974, 60000.00, 100.0));
		//carList.add(new UsedCar("Volkswagen", "Passat", 2014, 14000.00, 52.4));
	}

	public static void main(String[] args) {
		
		List<Car> carList = new ArrayList<>();
		int menu = -1;
		int numCars = 0;

		fillList(carList);

		do {
			do {
				numCars = count(carList);
				printList(carList, numCars);
				menu = askUser(scan, carList, numCars);
			} while (menu == -1);
			buyCar(scan, carList, menu, numCars);
		} while (menu != numCars);

		System.out.println("Good Bye!");
		String input ;
		
		
		do {
			System.out.println(carList.get(menu));
			scan.nextLine(); 
			
			System.out.println("Would you like to buy this car? (y/n)");
		input = scan.nextLine();

		} while (input.equalsIgnoreCase("y"));
			System.out.println("Cool beans enjoy your new car!");
			carList.remove(menu);
		scan.close();
	

	}

	private static int count(List<Car> carList) {
		
		return 0;
	}

	private static int askUser(Scanner scan, List<Car> carList, int numCars) {
		int input = 0;
		System.out.println("Which car would you like? ");

		input = scan.nextInt();

		if ((input >= 1) && input <= numCars + 1) {
			return input - 1;
		} else {
			System.out.println("Please enter a valid number.");
			return -1;
		}
	}

	private static void buyCar(Scanner scan, List<Car> carList, int menu, int numCars) {
		String input = "";

		if (menu == numCars) {
			return;
		}
	}

	private static void printList(List<Car> carList, int numCars) {
		int i = 0;

		for (Car count : carList) {
			System.out.printf("%-5d", (i + 1), ")");
			System.out.println(count);
			i++;
		}
	}

}
