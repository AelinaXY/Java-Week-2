
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
	
	
	public void setAge (int age) this.age = age;
	public void setName (int name) this.name = name;
	public void setTitle (int title) this.title = title;
	
	public int getAge() return age;
	public String getName() return name;
	public String getTitle() return title;


	

}
