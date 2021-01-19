package que;
import java.util.Scanner;
public class QueueSLL {
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}
	Node f=null;
	Node r=null;
	void enqueue(int data)
	{
		Node new_node=new Node(data);
		if(f==null)
		{
			f=new_node;
		}
		if(r!=null)
		{
			r.next=new_node;
		}
		r=new_node;
	}
	void dequeue()
	{
		if(f==null)
		{
			System.out.println("empty");
			return;
		}
		else
		{
			System.out.println(f.data);
			f=f.next;
			if(f==null) 
			{
				r=null;
			}
		}
	}
	void display()
	{	
		if(f==null)
		{
			System.out.println("empty");
			return;
		}
		else
		{
			Node curr=f;
			while(curr!=null)
			{
				System.out.print(curr.data+" ");
				curr=curr.next;
			}
			System.out.println("\n");
		}
	}
	void peek()
	{
		if(f==null)
		{
			System.out.println("empty");
			return;
		}
		System.out.println(f.data);
	}

	public static void main(String[] args) {
		System.out.println("ANWESHA SARANGI R19CI116");
		Scanner sc=new Scanner(System.in);
		QueueSLL q=new QueueSLL();
		while(true)
		{
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.display");
			System.out.println("4.peek");
			System.out.println("choose your option");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter the element for enqueue");
				int data=sc.nextInt();
				q.enqueue(data);
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				q.display();
				break;
			case 4:
				q.peek();
				break;
			default:System.out.println("invalid choice");
			}
		// TODO Auto-generated method stub

	}

}
}
