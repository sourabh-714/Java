import java.util.Scanner;
public class Sample1
{
	public static void main(String args[])
	{   Scanner a=new Scanner(System.in);
		int x[]={1,2,3,4,5,6,7,89};
		int c;
		int flag=0;
		System.out.println("enter the number to be searched");
		c=a.nextInt();
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==c)
			{
				System.out.println(i);
				flag=1;
			}
		}
			if(flag==1)
			{
				System.out.println("element is found");

			}
			else
			{
				System.out.println("element is not found");
			}
		
	}
}