
public class ArithmeticClass 
{
		private int num1;
		private int num2;
	
	public ArithmeticClass()
	{
		this.num1 = 1;
		this.num2 = 2;
	}
	public ArithmeticClass(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public int getNum1()
	{
		return num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public String arithmetic()
	{
		String str = "";
		
		// Adds	'Addition:     1      +     2      =      3'
		
		str += "Addition: " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n"; 
		
		//Adds	'Subtraction:    1      -      2      =       -1'
		
		str += "Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2) + "\n";
		
		//Adds	'Quotient:	   1     /     2      =       0'
		
		str += "Quotient: " + num1 + " / " + num2 + " = " + (num1 / num2) + "\n";
		
		//Adds	'Product: 	  1     *      2     =       3'
		
		str += "Product: " + num1 + " * " + num2 + " = " + (num1 * num2) + "\n";
		
		//returns all str
		return str;
	}
	public String comparingIntergers()
	{
		String str = "";
		str += "Comparing Integer:" + "\n";
		if (num1 > num2) {
			str += num1 + " is larger than " + num2 + "\n";
		} else if(num1 < num2 ) {
			str += num1 + " is smaller than " + num2 + "\n";
		} else {
			str += num1 + " is equal to " + num2 + "\n" + "These numbers are equal" + "\n";
		}
		return str;
	}
	public String oddOrEven()
	{
		String str = "";
		str += "Odd or Even:" + "\n";
		
		if (num1 % 2 == 0) {
			str += num1 + " is even" + "\n";
		}else {
			str += num1 + " is odd" + "\n";
		}
		str += "Odd or Even:" + "\n";
		
		if (num2 % 2 == 0) {
			str += num2 + " is even" + "\n";
		}else {
			str += num2 + " is odd" + "\n";
		}
		return str;
	}
}
	