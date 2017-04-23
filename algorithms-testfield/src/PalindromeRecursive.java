

public class PalindromeRecursive
{

	public static void main(String[] args)
	{
		PalindromeRecursive p = new PalindromeRecursive();
		System.out.println(p.checkPalindrome("aviva"));
		System.out.println(p.checkPalindrome("matt"));

	}
	
	public boolean checkPalindrome(String word)
	{
		if (word.length() == 1 || word.length() == 0)
		{
			return true;
		}
		if (word.charAt(0) == word.charAt(word.length()-1))
		{
			return checkPalindrome(word.substring(1, word.length()-1));
		}
		else
		{
			return false;
		}

	}

}
