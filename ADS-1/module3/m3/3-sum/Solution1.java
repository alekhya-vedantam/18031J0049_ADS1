import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
	public static boolean containsDuplicates(int[] arr) 
	{
        for (int i = 1; i < arr.length; i++)
            if (arr[i] == arr[i-1]) return true;
        return false;
    }
	public static void printAll(int[] arr) 
	{
        int n = arr.length;
        Arrays.sort(arr);
        if (containsDuplicates(arr)) throw new IllegalArgumentException("array contains duplicate integers");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int k = Arrays.binarySearch(arr, -(arr[i] + arr[j]));
                if (k > j) System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
            }
        }
    } 
	 public static int count(int[] arr) {
	        int n = arr.length;
	        Arrays.sort(arr);
	        if (containsDuplicates(arr)) throw new IllegalArgumentException("array contains duplicate integers");
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i+1; j < arr.length; j++) {
	                int k = Arrays.binarySearch(arr, -(arr[i] + arr[j]));
	                if (k > j) count++;
	            }
	        }
	        return count;
	    } 
	 public static void main(String[] args)  
	 { 
	        Scanner scan = new Scanner (System.in);
	        int[] a = {1000,-800,-200,234,435,3243,-3,2,1,12,-11,-1};
	        
	        int count = count(a);
			System.out.print("Number of Three sum number sets are:");
	        System.out.println("\t" + count);
	    } 
}
