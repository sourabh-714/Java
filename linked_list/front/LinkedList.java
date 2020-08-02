public class LinkedList
{
	Node head;
	public void insert(int data)
	{
		Node node=new Node();//creation of new object of Node class
		node.data=data;//assigning data to data object of node
		node.next=null;//creating address part as next
		if(head==null)//if node is first node
		{
			head=node;//declaring node as head
		}
		else//if node is not first node
		{
			Node n=head;//initialising n as temp node and initial point as head node to traverse all the node
			while(n.next!=null)//loop until the last node
			{
				n=n.next;//getting address value of eac node
			}
			n.next=node;//last node will not be accesses as it contains null address,so extra statement to accesss last node
		}

	}
	public void insertAtStart(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	public void show()//to print the node
	{
		Node node=head;//initialising node from head to transverse every node
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;//getting node address
		}
        System.out.println(node.data);//printing last node
	}


}