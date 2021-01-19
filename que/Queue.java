package que;
import java.util.Scanner;
public class Queue {
	int queue[];int front; int rear;
    Queue(int size)
	{
		queue=new int[size];
		front=-1;
		rear=-1;
	}
	
	void enqueue(int data)
	{
		if(rear==queue.length-1)
		{
			System.out.println("overflow");
			return;
		}
		if(front==-1 && rear==-1)
		{
			front++;
			rear++;
		}
		else
		{
			rear++;
		}
		queue[rear]=data;
	}
	void dequeue()
	{
		if(front==-1)
		{
			System.out.println("underflow");
			return;
		}
		System.out.println(queue[front]);
		if(front==rear)
		{
			front=rear=-1;
		}
		else
		{
			front++;
		}
	}
	public void display()
	{
		if(front==-1)
		{
			System.out.println("underflow");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.println(queue[i]+" ");
			}
		}
	}
	public void peek()
	{
		if(front==-1)
		{
			System.out.println("empty");
			return;
		}
		System.out.println(queue[front]);
	}

	public static void main(String[] args) {
		System.out.println("ANWESHA SARANGI R19CI116");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of queue");
		int size=sc.nextInt();
		Queue q=new Queue(size);
		while(true)
		{
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.display");
			System.out.println("4.peek");
			System.out.println("chooce your option");
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
		}
		
		// TODO Auto-generated method stub

	}

}
