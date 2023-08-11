package classesandconstructors;
class out1
{
	int d1=20;
}
public class innerlocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out1 o1=new out1();
		if(o1.d1<=20)
		{
			class inner1
			{
				void display()
				{
					
					System.out.println("New York Times");
				}
			}
			inner1 i1 =new inner1();
			i1.display();
		}
		else
			System.out.println("you are not in NewYork");

	}

}
