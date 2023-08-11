package abstractclass;

abstract class name1 //cannot create object for abstract class
{
	int a;
	abstract void display();
	void msg()
	{
		System.out.println("hello...");
	}
}
public class demo1 extends name1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 n=new demo1();
		n.msg();
	}

	@Override//because it is an abstract method
	void display() {
		// TODO Auto-generated method stub
		
	}

}
