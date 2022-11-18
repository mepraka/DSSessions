package Day2;
import java.util.Scanner;
public class StackForPractice {
    Scanner sc=new Scanner(System.in);
    public int size;
    public int []arr;
    public int top;
    public StackForPractice(){
        this.size=sc.nextInt();
        this.arr=new int[size];
        this.top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top == size - 1;
    }
    public int push(int element){
        if(!isFull()){
            top++;
            arr[top]=element;
            return arr[top];
        }else
            return -1;
    }
    public void pop(){
        System.out.println();
        if(!isEmpty()) {
            System.out.println(arr[top]+" element get deleted after pop() method");
            top--;
        }
        else
            System.out.println("Array is empty");
    }
    public int peek(){
        System.out.println();
        return arr[top];
    }
    public void displayStack(){
        System.out.print("Stack is ");
        for(int i=0;i<=top;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        StackForPractice obj=new StackForPractice();
        System.out.println("Add element "+obj.push(6));
        System.out.println("Add element "+obj.push(7));
        System.out.println("Add element "+obj.push(8));
        System.out.println("Add element "+obj.push(9));
        System.out.println("Add element "+obj.push(10));
        obj.displayStack();
        obj.pop();
        obj.displayStack();
        System.out.println("Display element after calling peek() method "+obj.peek());
    }
}
