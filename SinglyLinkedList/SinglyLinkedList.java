package Day4;

public class SinglyLinkedList {
    Node head;
    public SinglyLinkedList(){
        head=null;
    }
    public void insert(int element){
        Node nn=new Node();
        nn.data=element;
        nn.next=null;
        if(head==null)
            head=nn;
        else{
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=nn;
        }
    }
    public int count(){
        int ct=0;
        Node temp=head;
        while(temp!=null) {
            ct++;
            temp = temp.next;
        }
        return ct;
    }
    public void delete(int position){
        if(position<count()){
            if(position==0)
                head=head.next;
            else if(position>0 && position<count()-1){
                Node temp=head;
                int i=0;
                while(i!=position-1){
                    temp=temp.next;
                    i++;
                }
                temp.next=temp.next.next;
            }else{
                Node temp=head;
                while(temp.next.next!=null)
                    temp=temp.next;
                temp.next=null;
            }
        }else
            System.out.println("You gave wrong position");
    }
    public void display(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
         }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedList obj=new SinglyLinkedList();
        obj.insert(7);
        obj.insert(8);
        obj.insert(9);
        obj.insert(10);
        obj.insert(11);
        obj.display();
        obj.delete(1);
        obj.display();
    }
}
