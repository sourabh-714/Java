import java.util.Scanner;
public class  Runner
{
	public static void main(String args[])

	{   
		System.out.println("enter the head vaLUß");
		Scanner x=new Scanner(System.in);
		int y=x.nextInt();
		LinkedList list=new LinkedList();
		for(int a=0;a<4;a++)
		{
			list.insert(y);

		   
		}
		 list.show();

	}
}