import java.util.LinkedList;
import java.util.Scanner;
class linkedList
{
	LinkedList<Integer> ll = new LinkedList<>();
	public void push(int data)
	{
		ll.addFirst(data);
	}
	public void pop()
	{
		
		if(!ll.isEmpty())
		{
			ll.removeFirst();
		}
		
	}
	public void enqueue(int data)
	{
		ll.addLast(data);
	}
	public void dequeue()
	{
		ll.removeLast();
	}
	public String print()
	{
		if (ll.isEmpty()) 
		{
		return "Steque is empty.";
		}
		String st = ""+ ll.get(0);
		for (int i = 1; i < ll.size(); i++) {
			st = st + ", " + ll.get(i);
		}
		st = st + "";
		// System.out.println();
		return st;
	}
	}

public class Solution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i;
		String s;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		num=scan.nextInt();
		linkedList l = new linkedList();
		while(scan.hasNext())
		{
			s=scan.nextLine();
			String[] s1=s.split(" ");
			switch(s1[0])
			{
			case "push":	i=Integer.parseInt(s1[1]);
							l.push(i);
							System.out.println(l.print());
							break;
			case "pop" : 	l.pop();
							System.out.println(l.print());
							break;
			case "enqueue":	i=Integer.parseInt(s1[1]);
							l.enqueue(i);
							System.out.println(l.print());
							break;
			case "dequeue": l.dequeue();
							System.out.println(l.print());
							break;
			}
		}
		
	}
}