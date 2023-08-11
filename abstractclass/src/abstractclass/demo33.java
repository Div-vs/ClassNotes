package abstractclass;


abstract class na2 //cannot create object for abstract class
{
	int a;
	abstract void display1();
	final void msg2()
	{
		System.out.println("hello...");
	}
	abstract void display();
	static void msg1()
	{
		System.out.println("hi..");
	}
}
class na1 extends na2
{
	int a;
	void msg3()
	{
		System.out.println("hello...");
	}
	@Override
	void display1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
}


public class demo33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		na2 n1=new na1();
		n1.msg2();

	}

}
