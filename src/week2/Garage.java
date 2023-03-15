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
}
