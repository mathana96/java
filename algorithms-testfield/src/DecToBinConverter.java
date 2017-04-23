
import java.util.Scanner;

public class DecToBinConverter
{
	StringBuilder sBuilder = new StringBuilder();
	public DecToBinConverter()
	{
		
	}
	public static void main(String[] args)
	{
		DecToBinConverter d = new DecToBinConverter();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter decimal number to be converted");
		System.out.println(d.convertToBin(input.nextInt()));
		input.close();		
	}	
	public String convertToBin(int dec)
	{
		String ans = "0";
		if (dec > 0)
		{
			convertToBin(dec/2);
			return ans += sBuilder.append(dec%2);
		}
		return ans;
	}

}
