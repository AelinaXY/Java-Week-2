
public class Person {
	private int age;
	private String name, title;

	public Person(String name, int age, String title) {
		this.name = name;
		this.age = age;
		this.title = title;
	}

	public void stringOutput() {
		System.out.println("My name is " + name + " and I am " + age + " years old. I am a " + title);
	}

}
