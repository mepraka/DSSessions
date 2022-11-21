package RoshanShaan;

public class CircularLinkedList {
		Node head;
		public CircularLinkedList() {
			head=null;
		}
		public void insert(int element) {
			Node nn=new Node();
			nn.data=element;
			nn.next=null;
			if(head==null) {
				head=nn;
				nn.next=head;
			}else {
				Node temp=head;
				while(temp.next!=head) {
					temp=temp.next;
				}
				temp.next=nn;
				nn.next=head;
			}
		}
		
		public void display() {
			System.out.print(head.data+" ");
			Node temp=head.next;
			while(temp!=head) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		public static void main(String[] args) {
			CircularLinkedList obj1=new CircularLinkedList();
			obj1.insert(7);
			obj1.insert(8);
			obj1.insert(9);
			obj1.insert(10);
			obj1.insert(11);
			obj1.insert(12);
			obj1.display();
		}
}
