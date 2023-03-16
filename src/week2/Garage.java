package week2;

import java.util.ArrayList;

public class Garage {

	ArrayList<vehicle> vehiclesInGarage = new ArrayList<vehicle>();

	public Garage() {

	}

	public void addVehicle(vehicle v) {
		vehiclesInGarage.add(v);
		System.out.println("Vehicle " + v.toString() + " added");
	}

	public void removeVehicleType(String type) {
		switch (type) {
		case "Car":
			removeType(Car.class);
			break;
		case "Motorbike":
			removeType(Motorbike.class);
			break;
		case "Plane":
			removeType(Plane.class);
			break;
		}
	}

	private void removeType(Class<?> cls) {
		for (int i = vehiclesInGarage.size() - 1; i >= 0; i--) {
			if (vehiclesInGarage.get(i).getClass().equals(cls)) {
				System.out.println("Removing " + vehiclesInGarage.get(i));
				vehiclesInGarage.remove(i);
			}
		}
	}

	public void calculateGarageBill() {
		for (vehicle i : vehiclesInGarage) {
			calculateBill(i);
		}

	}

	public void calculateBill(vehicle i) {
		switch (i.getClass().toString()) {

		case "class week2.Motorbike":
			System.out.println("Bill to fix Motorbike ID: " + i.getId() + " is £" + i.getColour().length() * 100);
			break;

		case "class week2.Car":
			System.out.println("Bill to fix Car ID: " + i.getId() + " is £" + i.getWheels() * 200);
			break;

		case "class week2.Plane":
			System.out.println("Bill to fix Plane, ID: " + i.getId() + " is £"
					+ ((Plane) i).getWings() * 200 * i.getColour().length());
			break;
		}

	}
}
