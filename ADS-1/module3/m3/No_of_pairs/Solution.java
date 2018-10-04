
public class Solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size:");
		n= scan.nextInt();
		int a[] = new int[n];
		int searched[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element:");
			a[i]=scan.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			searched[j]=0;
		}
		for(int i=0;i<n-1;i++)
		{
			count=0;
			for(int j=1;j<n-1;j++)
			{
				if(a[i]==a[j])
				{
					//System.out.println(a[j]);
					count=count+1;
					searched[i]=a[i];
				}
				if(searched[i]==a[i])
				{
					j++;
				}
			}
		}
		System.out.println("The number of pairs are:"+count);
	}
}