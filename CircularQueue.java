package Day3;

import java.util.Scanner;

public class CircularQueue {
    Scanner sc=new Scanner(System.in);
    int size,front,rear;
    int[]circularQueue;

    public CircularQueue(){
        size=sc.nextInt();
        circularQueue=new int[size];
        front=rear=-1;
    }

    public boolean isEmpty(){
        return front==-1 && rear==-1;
    }

    public boolean isFull(){
        return ((rear+1)%size)==front;
    }
    public void enqueue(int element){
        if(!isFull()){
            if(isEmpty()){
                front=rear=0;
                circularQueue[rear]=element;
            }else{
                rear=(rear+1)%size;
                circularQueue[rear]=element;
            }
        }else
            System.out.println("Queue is full");
    }

    public void dequeue(){
        if(!isEmpty()){
            if(front==rear)
                front=rear=-1;
            else
                front=(front+1)%size;
        }
    }

    public void peek(){
        System.out.println(circularQueue[front]);
    }

    public void display(){
        if(!isEmpty()){
            int i=front;
            while(i!=rear) {
                System.out.print(circularQueue[i] + " ");
                i=(i+1)%size;
            }
            System.out.print(circularQueue[rear]);
        }
    }
    public static void main(String[] args) {
        CircularQueue obj=new CircularQueue();
        obj.enqueue(5);
        obj.enqueue(6);
        obj.enqueue(7);
        obj.enqueue(8);
        obj.dequeue();
        obj.enqueue(9);
        obj.enqueue(10);
        obj.peek();
        obj.display();
    }
}
