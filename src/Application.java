
public class Application {

	public static void main(String[] args) {
		
		Machine mech1 = new Machine();
		mech1.Start();
		
		Person person1 = new Person("Donnie");
		person1.Greet();
		
		//so far, Machine and Person are entirely separate
		//what if you want to create a common method for them?
		//they are not naturally related, so inheritance isn't the right thing.
		//we use an interface.
		
		//RIGHT CLICK project -- new -- new interface.
		//interfaces are like classes. you created Info interface.
		
		mech1.showInfo();
		person1.showInfo();
		
		//you can initialize an interface like so
		//although I don't know why you'd do it this way.
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		//you can only call methods in the interface
		
		//the following, and the method below
		//teach how to pass the interface information to a method
		//something like that, i'm a little unclear.
		outputInfo(mech1);
		outputInfo(person1);
	}
	
	private static void outputInfo(Info info) {
		
		info.showInfo();
	}
}

//typical syntax for interfaces: name them IThing, IStartUp, IAuthor, whatever
