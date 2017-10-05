
public class TwoIntegerRunner {
	public static void main(String[] args) 
	{
	ArithmeticClass mathy = new ArithmeticClass(5, 3);
	System.out.println(mathy.arithmetic());
	
	
	ArithmeticClass compare1 = new ArithmeticClass(3, 3);
	System.out.println(compare1.comparingIntergers());
	ArithmeticClass compare2 = new ArithmeticClass(2, 3);
	System.out.println(compare2.comparingIntergers());
	ArithmeticClass compare3 = new ArithmeticClass(3, 2);
	System.out.println(compare3.comparingIntergers());
	
	ArithmeticClass oddeven = new ArithmeticClass(7, 8);
	System.out.println(oddeven.oddOrEven());
	}
	

}
