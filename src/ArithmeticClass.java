
public class ArithmeticClass 
{
	
		private int jo;
		private int jr;
	
	public ArithmeticClass()
	{
		this.jo = 1;
		this.jr = 2;
	}
	public ArithmeticClass(int jo, int jr)
	{
		this.jo = jo;
		this.jr = jr;
	}
	public void setJo(int jo)
	{
		this.jo = jo;
	}
	public void setJr(int jr)
	{
		this.jr = jr;
	}
	public int getJo()
	{
		return jo;
	}
	public int getJr()
	{
		return jr;
	}
	public String arithmetic()
	{
		String str = "";
		str += jo + jr;
		return str;
	}
}
	