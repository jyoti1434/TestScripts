package peechee;

public class Arrayconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Print an array
		int[] arr= {1,45,67,789,654};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
	 	}
		System.out.println("==========================");
//reverse an array 
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
		System.out.println("==========================");

		for(int k=0;k<5;k++)
		{
			for (int l=0;l<k+1;l++)
			{
			System.out.print("*");
		}
			System.out.println();
		}
		System.out.println("==========================");

		for(int m=0;m<5;m++)
		{
			for(int n=m;n<5;n++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========================");

		for (int o=1;o<5;o++)
		{
			for(int p=1;p<o+1;p++)
			{
				System.out.print(p);
			}
			System.out.println();
		}
		System.out.println("==========================");

		for (int q=1;q<5;q++)
		{
			for(int r=1;r<q+1;r++)
			{
				System.out.print(q);
			}
			System.out.println();
			}
		System.out.println("==========================");

		for(int s=6;s>=0;s--)
		{
			for(int t=0;t<s;t++)
			{
				System.out.print(s);
			}
			System.out.println();
			}
		
		System.out.println("==========================");
		for(int u=4;u>=1;u--)
		{
			for (int v=1;v<=u;v++)
			{
				System.out.print(v);
			}
			System.out.println();
		}
		//swappinng of number with 3rd varible
		System.out.println("==========================");
		int x=30;
		int y=20;
		int c=x;
		x=y;
		y=c;
		
		System.out.print("After swapping: "+x +" " + y); 
		

		//swapping of number without 3rd variable
		System.out.println("==========================");

		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("After swapping: "+x +" " + y); 
		
		System.out.println("==========================");

		// 
			}
		
		
		}
	
		


