package Day2;

import java.util.Scanner;

public class Queue {
    Scanner sc=new Scanner(System.in);
    int front,rear,size;
    int[]queue;
    public Queue() {
        this.front = -1;
        this.rear = -1;
        size = sc.nextInt();
        this.queue = new int[size];
    }
    public boolean isFull(){
        return rear==size-1;
    }

    public boolean isEmpty(){
        return front==-1 && rear==-1;
    }
    public void enqueue(int element){
      if(isEmpty()) {
          front = rear = 0;
          queue[rear]=element;
      }else if(!isEmpty()) {
          rear++;
          queue[rear] = element;
      }
      else
          System.out.println("Queue is full");
    }

    public void dequeue(){
        if(!isEmpty()){
            front++;
        }else
            System.out.println("Queue is empty");
    }
    public void display(){
        System.out.println();
        if(!isEmpty()){
            for(int i=front;i<rear+1;i++)
                System.out.print(queue[i]+" ");
        }else
            System.out.println("Queue is empty");
    }
    public static void main(String[] args) {
        Queue obj=new Queue();
        obj.enqueue(7);
        obj.enqueue(8);
        obj.enqueue(9);
        obj.enqueue(10);
        obj.enqueue(11);
        obj.display();
        obj.dequeue();
        obj.display();

    }
}
