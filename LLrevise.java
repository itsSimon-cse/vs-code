public class LLrevise {
    Node head;
    class Node{
        String data;
        Node next;
        //create consrt
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void addFront(String data){
        Node newNode=new Node(data);
        if(head==null){
            //  newNode=head;
            head=newNode;
             return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
            Node newNode=new Node(data);
            Node curNode=head;
            while(curNode.next!=null){
                curNode=curNode.next;//keep updating the calue of curnode
            }
                curNode.next=newNode;
                
            }

    

    public void printList(){
        //print by usrinf a cuurr node
        Node curNode=head;//reference of head
            while(curNode!=null){
                System.out.println(curNode.data);
                curNode=curNode.next;
            }
            System.out.println("null");
    }

    public static void main(String args[])
    {
        LL list=new LL();
        list.Addfront("a");
        list.Addfront("b");
        list.AddLast("z");
        list.printList();
    }
}
