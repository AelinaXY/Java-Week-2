package week2;

public class Plane extends vehicle {

	private int wings;

	public Plane(int w, String c, boolean f, int wi, int i) {
		super(w, c, f, i);
		// TODO Auto-generated constructor stub
		this.wings = wi;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

}
