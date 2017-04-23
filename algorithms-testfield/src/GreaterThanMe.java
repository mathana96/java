
import java.util.Arrays;

public class GreaterThanMe
{

	public static void main(String[] args)
	{
		GreaterThanMe g = new GreaterThanMe();
		int [] a = {3,4,5,9,2,1,3};
		System.out.println(Arrays.toString(g.checkGreaterQuadratic(a)));
	}
	
	public int [] checkGreaterQuadratic(int[] a)
	{
		int N = a.length;
		int [] b = new int [N];
		for (int i=0; i<N; i++)
		{
			int num = 0;
			for (int j=i+1; j<N; j++)
			{
				if(a[j] > a[i])
				{
					num++;				
				}		 
			}
			b[i] = num;
		}
		return b;
	}
//	
//	public int [] checkGreaterMergeSort(int[] a)
//	{
//		
//	}
}
