//Take array value through keyboards as a integer and display those number in ascending order or descending order. (nested loop) 

import java.util.Scanner;
public class Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("How many no");
		int n= sc.nextInt();
		int abc[]= new int[n];
		System.out.println("Enter no");
		for(int i=0 ;i<n;i++)
		{
			abc[i]=sc.nextInt();
		} 
		
		System.out.println("Arrray before sorting");
		
		for(int i=0 ;i<n;i++)
		{
			System.out.println(abc[i]);
		} 
		
		
		System.out.println("Array elements after sorting:");  
		System.out.println("Ascening");
		
		for (int i = 0; i < abc.length; i++)   
		{  
			for (int j = i + 1; j < abc.length; j++)   
			{  
				int temp = 0;  
				if (abc[i] > abc[j])   
				{  
					temp = abc[i];  
					abc[i] = abc[j];  
					abc[j] = temp;  
				}  
			}  
	//prints the sorted element of the array  
			System.out.println(abc[i]);  
		}  
		
		System.out.println("descending ");  
		for (int i = 0; i <abc.length; i++)   
		{  
			for (int j = i + 1; j < abc.length; j++)   
			{  
				int temp = 0; 
				if (abc[i] < abc[j])   
				{  
						temp = abc[i];  
						abc[i] = abc[j];  
						abc[j] = temp;  
				}  
			}  
			System.out.println(abc[i]);  
		}  
		
	}

}
