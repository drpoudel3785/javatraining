package studentmanagement;

import interfaces.MyInterface;
import interfaces.MyOtherInterface;

public class InterfaceTested implements MyInterface, MyOtherInterface {

	public void sayHello() {
		System.out.println(MyInterface.hello);
	}
	
	public void sayGoodBye() {
		System.out.println("GOod Bye");
	}
	
	

}
