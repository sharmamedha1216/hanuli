package operations;

public class ExecutionClass {

	public static void main(String[] args) {
		// without creating object in class
	/*	basicOperations.toAdd();
		basicOperations.toSub();
	} */
	
		//using object calling the method. Here we need to remove static from method.
	basicOperations obj = new basicOperations();
	obj.toAdd();
	obj.toSub();	
	
	}
}
