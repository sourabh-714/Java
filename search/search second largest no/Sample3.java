import java.util.Scanner;

	public class Sample3
	{
		public static void main(String args[])
		{
			int x[]={1,5,4,9};
			int largest=x[0];
			int largest2=x[0];
			for(int i=0;i<x.length;i++)
			{
				if(x[i]>largest)
				{
					largest2=largest;
					largest=x[i];
				}
				else if (x[i]>largest2)
				{
					largest2=x[i];
				}
			}
			System.out.println(largest2);
		}
	}
	

