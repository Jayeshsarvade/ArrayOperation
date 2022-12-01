import java.util.Scanner;
public class ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int evensum=0;
		int oddsum=0;
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
		
		for(int i=0;i<n;i++)
		{
			sum=sum+abc[i];
		}
		
		for(int i=0;i<n;i++)
		{
			
			if(abc[i]%2==0)
			{
				evensum=evensum+abc[i];
			}
			else
			{
				oddsum=oddsum+abc[i];
			}
		}
		
		System.out.println(sum);
		System.out.println("odd sum:"+oddsum);
		System.out.println("even sum:"+evensum);
	}
}