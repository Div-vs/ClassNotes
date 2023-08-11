package abstractclass;
abstract class out
{
	abstract void outer();
	abstract class inn
	{
		abstract void inner();
	}
}
class out1 extends out
{
	class inn1 extends inn
	{

		@Override
		void inner() {
			// TODO Auto-generated method stub
			System.out.println("asadaf..");
			
		}

	}

	@Override
	void outer() {
		// TODO Auto-generated method stub
		System.out.println("hdgdss...");
		
	}
}
public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out1 o1=new out1();
		out1.inn1 in=o1.new inn1();//nested object creation
		o1.outer();
		in.inner();

	}
}

