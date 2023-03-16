package week2;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehiclesInGarage = new ArrayList<Vehicle>();

	public Garage() {

	}

	public void addVehicle(Vehicle v) {
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
		for (Vehicle i : vehiclesInGarage) {
			calculateBill(i);
		}

	}

	public void calculateBill(Vehicle i) {
		switch (i.getClass().getSimpleName()) {

		case "Motorbike":
			if (i.isNeedsFixing()) {
				System.out.println("Bill to fix Motorbike ID: " + i.getId() + " is £" + i.getColour().length() * 100);
				i.setNeedsFixing(false);
			}
			break;

		case "Car":
			if (i.isNeedsFixing()) {
				System.out.println("Bill to fix Car ID: " + i.getId() + " is £" + i.getWheels() * 200);
				i.setNeedsFixing(false);
			}
			break;

		case "Plane":
			if (i.isNeedsFixing()) {
				System.out.println("Bill to fix Plane, ID: " + i.getId() + " is £"
						+ ((Plane) i).getWings() * 200 * i.getColour().length());
				i.setNeedsFixing(false);
			}
			break;
		}

	}

	public void removeById(int id) {
		Vehicle returnedVehicle = findVehicleByID(id);
		vehiclesInGarage.remove(returnedVehicle);
		System.out.println("Vehicle with id " + id + " removed");
	}

	public void fixById(int id) {
		Vehicle returnedVehicle = findVehicleByID(id);
		calculateBill(returnedVehicle);
	}

	private Vehicle findVehicleByID(int id) {
		for (Vehicle i : vehiclesInGarage) {
			if (i.getId() == id) {
				return i;
			}
		}

		return null;
	}
}
