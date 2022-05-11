package peechee;

import java.util.ArrayList;

public class javabrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //define array
		String aa="Ankit";
		String b="Ankit";
		b="vipu";
		System.out.println(aa);
		System.out.println(b);
		
		int[] arr= new int[5];
		arr[0]=2;
		arr[1]=3;
		arr[2]=4;
		System.out.println(arr[1]);
		//different initialization of an array
		int[] arr1= {2,6,8,9};
		System.out.println(arr1[3]);
		//string  array
	String[] name= {"JYoti","Ankit"};
		System.out.println(name[1]);
		
		//string array with for loop
		String[] name1= {"Happy","weekend","is","coming"};
		for( int i=0; i<name1.length;i++)
		{
			System.out.println(name1[i]);
		}
		//if else array and loop
		//print a number which is multiple of 2 ,only 1 number
		int[] arr3 = {1,2,4,6,8,10,45,122};
		for(int i =0;i<arr3.length;i++)
		{
			if(arr3[i]%2==0)
			{
			System.out.println(arr3[i]);
			break;
			}
			else
			{
				System.out.println(arr3[i] +"is not multiple of 2");
			}
			}
		//array list initialization
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Bangalore");
		a.add("Chennai");
		a.add("Pune");
		System.out.println(a.get(1));
		
		String s = "Jyoti Ankit Happy";
		String [] splittedstring= s.split("Ankit");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim());
		for (int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
			}
		}
		
	 			
	
	


