package learning;

public class PalindromeNonRecursive
{

	public static void main(String[] args)
	{
		PalindromeNonRecursive p = new PalindromeNonRecursive();
		System.out.println(p.checkPalindrome("aviva"));
		System.out.println(p.checkPalindrome("matt"));
	}
	
	public boolean checkPalindrome(String word)
	{
		int N = word.length();
		int total = 0;
		for (int i=0; i<N; i++)
		{
			if (word.charAt(i) == word.charAt((N-1)-i))
			{
				total++;
			}
		}
		if (total == N)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
