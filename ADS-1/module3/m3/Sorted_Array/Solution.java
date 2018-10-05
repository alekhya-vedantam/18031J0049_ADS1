import java.util.Arrays;
import java.util.Scanner;
public class Solution
{
	public static void main(String[] args)
	{
		int n,m;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array1:");
		n=scan.nextInt();
		System.out.println("Enter the size of array2:");
		m=scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		for(int i;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int j=0;j<m;j++)
		{
			b[j]=scan.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<n+m;i++)
		{
			System.out.println("The sorted array is:"+" "+a[i]+b[i]);
		}
	}
}