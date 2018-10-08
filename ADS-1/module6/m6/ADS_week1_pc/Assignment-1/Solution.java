import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;
class AddLargeNumbers {

    public static LinkedList numberToDigits(String number) 
    {
    	LinkedList<Character> list1 = new LinkedList<Character>();
    	int i=0;
    	char n;
    	for(i=0;i<number.length();i++)
    	{
    		n=number.charAt(i);
    		list1.add(n);
    		i++;
    	}
		return list1;
    }
    public static String digitsToNumber(LinkedList list) 
    {
    	int i=0;
    	String s="";
    	for(i=0;i<list.size();i++)
    	{
    		s=s+list.get(i);
    	}
    	return s;
    }
    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) 
    {
    	int i,item,item2,j,v1,v2,sum,carry;
    	Stack<Integer> stack1= new Stack<Integer>();
    	Stack<Integer> stack2= new Stack<Integer>();
    	LinkedList<Integer> list3= new LinkedList<Integer>();
    	for(i=0;i<list1.size();i++)
    	{
    		item=(int) list1.get(i);
    		stack1.push(item);
    	}
    	for(i=0;i<list2.size();i++)
    	{
    		item2=(int) list2.get(i);
    		stack2.push(item2);
    	}
    	for(i=0,j=0;i<stack1.size() && j<stack2.size();i++,j++)
    	{
    		carry=0;
    		v1=stack1.pop();
    		v2=stack2.pop();
    		sum=v1+v2;
    		if(sum>=10)
    		{
    			list3.add(sum%10);
    			carry=sum/10;
    			sum=v1+v2+carry;
    		}
    		else
    		{
    			list3.add(sum);
    		}
    	}
    	return list3;

    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
            	
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);           	
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
            	
                LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);            	
                LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
