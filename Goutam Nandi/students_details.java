package new_pakage;
import java.util.*;

public class students_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		String name[]=new String[5];
		long number[]=new long[5];
		int age[]=new int[5];
		System.out.println("How Many details want to Upload:");
		int n=sc.nextInt();
		System.out.println("Enter the details");
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name");
			name[i]=sc.next();
			System.out.println("Enter the number");
			number[i]=sc.nextLong();
			System.out.println("Enter the age ");
			age[i]=sc.nextInt();
		}
		System.out.println("Displaying the details");
		for(int i=0;i<n;i++) {
			System.out.println("Details of the members are\r ");
			System.out.println("name- "+name[i]+"\n"+"number-"+number[i]+"\n"+"age-"+age[i]);
			
		}


	}

}

