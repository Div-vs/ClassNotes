package classesandconstructors;
class out //class
{
	void getdata()//method
	{
		int sum=0;
		class inner//class
		{
			int div;
			int rem;
			void di()//method
			{
				System.out.println("Times Square");
			}
		}
		inner n1=new inner();
		n1.di();
	}
}
public class localinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out o1=new out();
		o1.getdata();
	}
}
