import java.util.LinkedList;
import java.util.Scanner;
class Dequeue1
{
	LinkedList<Integer> ll = new LinkedList<Integer>();
	public boolean isEmpty()
	{
		if(ll.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void size()
	{
		ll.size();
	}
	public void pushData(int data)
	{
		ll.add(data);
	}
	public void popData()
	{
		ll.removeFirst();
	}
	public void pushRight(int item)
	{
		pushData(item);
	}
	public void popLeft()
	{
		popData();
	}
	public void pushLeft(int item)
	{
		ll.addFirst(item);
	}
	public void popRight()
	{
		ll.removeLast();
	}
	public void print()
	{
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
	}
}
public class Solution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,data;
		String s,s2;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		Dequeue1 d = new Dequeue1();
		
		for(i=0;i<n;i++)
		{
			s=scan.next();
			String[] s1 = s.split(" ");
			switch(s1[0])
			{
			case "isEmpty":	d.isEmpty();
							break;
							
			case "size":	d.size();
							break;
							
			case "pushLeft":	data=Integer.parseInt(s1[1]); 
								d.pushLeft(data);
								d.print();
								break;
			case "pushRight":	data=Integer.parseInt(s1[1]);
								d.pushRight(data);
								d.print();
								break;
			case "popLeft":		d.popLeft();
								d.print();
								break;
			case "popright":	d.popRight();
								d.print();
								break;
			}
		}
	}

}