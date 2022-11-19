package RoshanShaan;

import java.util.Scanner;

public class CircularQueue {
	Scanner sc=new Scanner(System.in);
	int size,front,rear;
	int[]arr;
	
	public CircularQueue() {
		size=sc.nextInt();
		arr=new int[size];
		front=rear=-1;
	}
	
	public boolean isEmpty() {
		return rear==-1;
	}
	public boolean isFull() {
		return (rear+1)%size==front;
	}
	
	public void enqueue(int element) {
		if(!isFull()) {
			if(isEmpty()) {
				front=rear=0;
				arr[rear]=element;
			}else {
				rear=(rear+1)%size;
				arr[rear]=element;
			}
		}else
			System.out.println("Queue is full");
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			if(rear==front)
				front=rear=-1;
			else
				front=(front+1)%size;
		}else
			System.out.println("Queue is Empty");
	}
	public void peek() {
		if(!isEmpty())
			System.out.println(arr[front]);
		else
			System.out.println("Queue is empty");
	}
	public void display() {
		if(!isEmpty()) {
			int i=front;
			while(i!=rear) {
				System.out.print(arr[i]+" ");
				i=(i+1)%size;
			}
			System.out.print(arr[rear]);
		}
		
			
//		if(!isEmpty()) {
//			if(front>rear) {
//			for(int i=front;i<size;i++)
//				System.out.print(arr[i]+" ");
//			for(int i=0;i<=rear;i++)
//				System.out.print(arr[i]+" ");
//			}else {
//				for(int i=front;i<=rear;i++)
//					System.out.print(arr[i]+" ");
//			}
//		}
	}
	public static void main(String[] args) {
		CircularQueue obj=new CircularQueue();
		obj.enqueue(7);
		obj.enqueue(8);
		obj.enqueue(9);
		obj.enqueue(10);
		obj.dequeue();
		obj.enqueue(11);
		obj.enqueue(12);
		obj.enqueue(99);
		obj.dequeue();
		obj.dequeue();
		obj.enqueue(56);
		obj.enqueue(36);
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.enqueue(23);
		obj.enqueue(45);
		obj.enqueue(46);
		obj.enqueue(47);
		obj.display();
	}
}
