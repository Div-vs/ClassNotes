package abstractclass;
abstract class human
{
	private String name;
	public human(String name)
	{
		this.name=name;
	}
	public abstract void city();
	public String getName()
	{
		return name;
	}
	
}
class living extends human
{
	public living(String name)
	{
		super(name);
	}

	@Override
	public void city() {
		// TODO Auto-generated method stub
		System.out.println("located in India,-"+getName());		
	}
}
public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		living l1=new living("Chennai");
		living l2=new living("Madurai");
		
		l1.city();
		l2.city();
	}
}
