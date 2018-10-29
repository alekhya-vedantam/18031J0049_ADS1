import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		while(sc.hasNext())
		{
			cutoff=Integer.parseInt(sc.nextLine());
			String s=sc.nextLine();
			String []b=s.split(" ");
			quickSort2(b,0,b.length-1,cutoff);
		}	
		
		
	}	
	static int pi,cutoff;
	
	 static  void quickSort2 (String[] arr,int low,int high,int cutoff)
	{
		 //System.out.println(Arrays.toString(arr));
		 if((high-low)<cutoff)
		 {		 int i, j;
		 String key;
		
		  if(high-low>=-1)
			System.out.println("Insertion sort method invoked...");
			   for (i = low+1; i <=high; i++) 
			   { 
			       key = arr[i]; 
			       j = i-1;
			       while (j >= 0&&arr[j].compareTo(key)>0)
			       { 
			           arr[j+1] = arr[j];
			    	   j = j-1; 
			       } 
			       
			       arr[j+1] = key; 
			   }
		 }
		else
		if(low>=0&&high<=arr.length)
		{
			
	    if (low < high)
	    {
	    	if(high-low>=cutoff)
	    	{
	         pi = partition(arr, low, high);
	        System.out.println(Arrays.toString(arr));
                    if(pi>0&&pi<=arr.length)
	        quickSort2(arr, low, pi - 1,cutoff);  // Before pi
                    if(high>=0&&high<=arr.length)
	        quickSort2(arr, pi + 1, high,cutoff); // After pi
	    	}
	    }
		}
	}
	 private static int partition(String[] a, int lo, int hi) {
		 int i = lo;
	     int j = hi + 1;
	     String v = a[lo];
	     while (true) { 
	    	 
	    	 i++;
	    	// System.out.print("i val:"+i );
	         while ((i<=hi && a[i].compareTo(v)<0 )) {
	        	 i++;
	             if (i == hi) break;
	         }
	         j--;
	         //System.out.println("j val:"+j );

	         while (a[j].compareTo(v)>0) {
	        	 j--;
	             if (j == lo) break;  
	         }
	         if (i >= j) break;

		String temp = a[i]; 
	    a[i] =a[j]; 
	    a[j] = temp;
	     }
	     //System.out.println("io ..i val:"+i);
	     String temp = a[lo]; 
	     a[lo] = a[j]; 
	     a[j] = temp;
	     return j;
	    }
}



