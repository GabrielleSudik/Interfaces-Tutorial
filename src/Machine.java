
public class Machine implements Info {

	//adding "implements Info" alone gives an error
	//so HOVER on Machine -- add unimplemented methods
	
	public void Start() {
		System.out.println("Machine started.");
	}
	
	private int id = 7;

	//this was added when you added unimplemented methods
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine id is: " + id);
	}
}
