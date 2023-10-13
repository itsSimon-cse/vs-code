public class LL{
    Node head;
            //create a node
            class Node{
                //in a node we have dtata and next link to node
                String data;
                Node next;

                //createa a constructore

                Node(String data)
                {
                this.data=data;
                this.next=null;
                }
            }
            
            //add node from front
            public void Addfront(String data){
                //if node is null return
                    Node newnode= new Node(data);

                if(head==null)
                {
                    //create a node and make it head

                    head=newnode;
                    return;
                }
                //if already a list is existing, head is not a null value so make new node to point next to head
                newnode.next=head;
                head=newnode;

            }

            public void AddLast(String data)
            {   
                    Node newnode= new Node(data);

                    if(head==null)
                    {//if head itself is null then creae a new node and make it head
                        head=newnode;
                        return;
                    }
                    //to add last dont use head,create a cuurenyt nide reference to head and use
                    Node currNode=head;
                    while(currNode.next!=null)//trancerse to the last node
                    {
                            currNode=currNode.next;//keep updating the value of curnode to its next node
                    }
                    //after reachong last node add the new node
                   currNode.next= newnode;

            }
            public void printList(){
               Node currNode= head;
               while(currNode!=null){
               System.out.println(currNode.data);
               currNode=currNode.next;
               }
               System.out.println("null");
            }

            public void deteleFirst()
            {
                if(head==null)
                {
                    return;
                }

                head=head.next;
            }
            public void deleteLast(){
                if(head==null){
                    return;
                }
               Node secondlast=head;
               Node last=head.next;

               while(last.next!=null){
                last=last.next;
                secondlast=secondlast.next;
               }
               //head=secondlast;
               secondlast.next=null;
            }
public static void main(String args[])
{
    LL list=new LL();
    list.Addfront("a");
    list.Addfront("b");
    //list.printList();
    list.AddLast("c");
    //list.printList();
    //list.deteleFirst();
    list.deleteLast();
    list.printList();

}


}