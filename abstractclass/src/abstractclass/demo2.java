package abstractclass;

abstract class n1 //cannot create object for abstract class
{
	int a;
	abstract void display();
	void msg()
	{
		System.out.println("hello...");
	}
}
class name2 extends n1
{
	int a;
	void msg()
	{
		System.out.println("hello...");
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
}
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
