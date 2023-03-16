package week2;

public class Main {

	public static void main(String[] args) {
//		Loops.print10();
//		Loops.changeCalculator(50d, 23.14d);

//		Arrays.int10Array();
//		Arrays.multArray();
//		Arrays.digitAdd(74);

//		System.out.println(Arrays.numToString(6059));

//		for (int i = 1; i <= 9999; i++) {
//			System.out.println(Arrays.numToString(i));
//		}

//		System.out.println(stringMethods.wordCount("Hello"));
//		System.out.println(stringMethods.wordCount("Hello World"));
//		System.out.println(stringMethods.wordCount("Hello World, My name is El"));
//		System.out.println(stringMethods.wordCount(""));

//		Person p1 = new Person("test1",1,"title1");
//		Person p2 = new Person("test2",2,"title2");
//		Person p3 = new Person("test3",3,"title3");
//		
//		p1.stringOutput();
//		
//		p2.stringOutput();

		Garage weirdGarage = new Garage();

		Car blueCar = new Car(4, "Blue", false, 2, 1);
		Motorbike blackBike = new Motorbike(2, "Black", false, "Black", 2);
		Plane redPlane = new Plane(3, "Red", false, 2, 3);

		weirdGarage.addVehicle(blueCar);
		weirdGarage.addVehicle(blackBike);
		weirdGarage.addVehicle(redPlane);

		weirdGarage.calculateGarageBill();

		weirdGarage.removeVehicleType("Car");
		weirdGarage.removeVehicleType("Plane");
		weirdGarage.removeVehicleType("Motorbike");

	}

}
