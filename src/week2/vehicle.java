package week2;

public class vehicle {

	private int wheels, id;
	private String colour;
	private boolean needsFixing = false;

	public vehicle(int w, String c, boolean f, int i) {
		this.wheels = w;
		this.colour = c;
		this.needsFixing = f;
		this.id = i;
	}

	public void fixVehicle() {
		if (needsFixing) {
			System.out.println("Vehicle does not need fixing");
		}

		else {
			needsFixing = true;
			System.out.println("Vehicle fixed");

		}
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isNeedsFixing() {
		return needsFixing;
	}

	public void setNeedsFixing(boolean needsFixing) {
		this.needsFixing = needsFixing;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
