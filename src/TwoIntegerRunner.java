import java.util.Scanner;
public class TwoIntegerRunner 
{
	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	int firstNum = 0;
	int secNum = 0;
	firstNum = input.nextInt();
	secNum = input.nextInt();
	
	ArithmeticClass mathy = new ArithmeticClass(firstNum, secNum);
	System.out.println(mathy.arithmetic());
	//System.out.println(mathy.arithmetic());
	
	System.out.println(mathy.comparingIntegers());
	//System.out.println(mathy.comparingIntergers());
	//System.out.println(mathy.comparingIntergers());
	
	System.out.println(mathy.oddOrEven());
	
	System.out.println(mathy.multiples());
	//System.out.println(mathy.multiples());
	input.close();
	}
}
