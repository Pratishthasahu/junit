package junit;

public class Calculator {
	public double add(double a,double b)
	{
		return a+b;
	}
	
	public double subtract(double a,double b)
	{
		return a-b;
	} 
	
	public double multiply(double a,double b)
	{
		return a*b;
	}
	
	public double divide(double a,double b)
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		return a/b;
	}
	public static void main(String args[])
	{
		Calculator obj = new Calculator();
		double res = obj.add(10.0, 10.0);
		System.out.println("REsult= "+res);
	}
}
