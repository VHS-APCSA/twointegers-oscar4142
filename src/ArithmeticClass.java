
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
		
		// Adds	'Addition:     1      +     2      =      3'
		
		str += "Addition: " + jo + " + " + jr + " = " + (jo + jr) + "\n"; 
		
		//Adds	'Subtraction:    1      -      2      =       -1'
		
		str += "Subtraction: " + jo + " - " + jr + " = " + (jo - jr) + "\n";
		
		//Adds	'Quotient:	   1     /     2      =       0'
		
		str += "Quotient: " + jo + " / " + jr + " = " + (jo / jr) + "\n";
		
		//Adds	'Product: 	  1     *      2     =       3'
		
		str += "Product: " + jo + " * " + jr + " = " + (jo * jr) + "\n";
		
		//returns all str
		return str;
	}
	public String comparingIntergers()
	{
		String str = "";
		str += "Comparing Integer:" + "\n";
		str += "Enter first interger:" + "\n" + jo + "\n";
		str += "Enter second interger" + "\n" + jr + "\n";
		str += "Statement is:" + "\n" + (jo <= jr);
		return str;
	}
}
	