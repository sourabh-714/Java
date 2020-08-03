public class Runner
{
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		list.insert(0);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertAt(2,100);
		list.show();
	}
}