import java.util.*;
public class my {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the "+n+" elements ");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for (int i=1;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum number is: "+max);
	}

}