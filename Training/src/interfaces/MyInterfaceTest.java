package interfaces;

public class MyInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyInterface.hello);
		
		MyInterfaceImpl myinterfaceimpl = new MyInterfaceImpl();
		myinterfaceimpl.sayHello();
		myinterfaceimpl.sayGoodBye();

	}

}
