package assignment_1;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		int n, max;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the limit:");
        n = ob.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the numbers:");
        for(int i = 0; i < n; i++){
            a[i] = ob.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++){
            if(max < a[i]){
                max = a[i];
            }

        }
        System.out.println("Maximum value:"+max); 
	}
}