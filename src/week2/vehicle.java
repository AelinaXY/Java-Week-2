package week2;

public class vehicle {

	private int wheels;
	private String colour;
	private boolean needsFixing = false;

	public vehicle(int w, String c, boolean f) {
		this.wheels = w;
		this.colour = c;
		this.needsFixing = f;
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

}
