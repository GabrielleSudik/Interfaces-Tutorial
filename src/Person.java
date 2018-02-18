
public class Person implements Info{
	
	//you can have multiple implemented classes. just use a comma.
	//inheritance can only use one.
	
	public void Greet() {
		System.out.println("Hello, sailor.");
	}
	
	private String name;

	//right click -- source -- generate constructor using fields
	public Person(String name) {
		//super();
		this.name = name;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Person's name is: " +name);
	}
	
	

}
