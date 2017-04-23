package learning;

public class Factorial
{

	public static void main (String[] args)
	{
		Factorial factorial = new Factorial();
		System.out.println(factorial.factorialRecursive(5));
		System.out.println(factorial.factorialIterative(5));
	}
	
	public int factorialRecursive(int n)
	{
		if (n > 1)
			return factorialRecursive(n-1) * n;
		else
			return n;
	}
	
	public int factorialIterative(int n)
	{
		for (int i=n; (i-1)>0; i--)
			n *= (i-1);
		return n;
	}
	

}
