package new_pakage;
import java.util.*;
public class star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row :");
		int row=sc.nextInt();
		
		
		for(int i=0;i<=row;i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print("*");
	
			}
			System.out.println();
			
			
		}
		
	}
}