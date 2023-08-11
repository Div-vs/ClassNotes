package abstractclass;
class Area<T>//data type
{
	private T t1;//data type is flexible according to the object
	public void add(T t)
	{
		this.t1=t;
	}
	public T get()
	{
		return t1;
	}
}
public class generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area<Integer> a1=new Area<Integer>();
		Area<String> a2=new Area<String>();
		a1.add(2438683);
		a2.add("Krishna");
		System.out.println(a1.get());
		System.out.println(a2.get());
	}

}
