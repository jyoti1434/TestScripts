package peechee;

public class commonprograms {
	public static void main(String[] args) {
	
		int n=989;
		int a,sum=0,temp;
		temp=n;
		while(n>0)
		{
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;
		
		}
		if(temp==sum)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		}
		
	}


