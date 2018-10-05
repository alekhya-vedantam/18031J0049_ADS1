package Sum_3;
import java.util.Scanner;

public class Solution
{
	private static int a;
	private static int c=0;
	public int count()
	{
		
		return c;
	}
	public static void main (String [] args)
	{
		int i,j,k;
		int[] s;
		s= new int [1000];
		Scanner sc=new Scanner(System.in);
		Solution s3= new Solution();
		while(sc.hasNextInt())
		{
			for(i=0;i<s.length-2;i++)
			{
//				for(j=i+1;j<i+2;j++)
//				{
//					s[i]=sc.nextInt();
//					if(i==s.length-2)
//					{
//						s[j]= sc.nextInt();
//						k=i+2;
//						s[k]=sc.nextInt();
//						a=s[i]+s[j]+s[k];
//						//System.out.println(a);
//						s3.count();
					//}
				//}
				j=i+1;
				k=s.length;
				while(j<k)
				{
					if(s[i]+s[j]+s[k]==0)
					{
						c=c+1;
					}
					else
					{
						k--;
					}
				}
				s3.count();
				
			}
		}
		//System.out.println(d);
	}
	
}
