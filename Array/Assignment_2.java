//Take string array value through keyboards and display all names. 


import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("How many names");
		int n= sc.nextInt();
		String abc[]= new String[n];
		System.out.println("Enter names");
		for(int i=0 ;i<abc.length;i++)
		{
			abc[i]=sc.nextLine();
		} 
		
		System.out.println(abc[0]);
		
		for(int i=0 ;i<n;i++)
		{
			System.out.println(abc[i]);
		} 

	}

}
