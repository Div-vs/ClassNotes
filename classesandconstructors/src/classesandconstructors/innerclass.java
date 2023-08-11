package classesandconstructors;
class outer
{
	static int a=10;
	int b=20;
	
	class inner
	{
		void display()
		{
			System.out.println(a+b);
		}
	}
}

public class innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer o1=new outer();
		//System.out.println(o1.a);
		outer.inner oi=o1.new inner();
		oi.display();

	}

}
