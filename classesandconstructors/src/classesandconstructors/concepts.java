package classesandconstructors;

class demo1
{
	static int a2=20;
	void display1()
	{
		System.out.println("Hiii!...Its me");
	}
static class demo
{
	int a=10;
	int b=20;
	void display()
	{
		System.out.println(a+b+a2);
	}
}
}
public class concepts {

	public static void main(String[] args) {
		demo1 d2=new demo1();
		demo1.demo d1=new demo1.demo();
		d1.a=100;
		d1.display();
		d2.display1();
	}
}

