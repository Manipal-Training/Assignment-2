import java.util.Scanner;
class Main {
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1 :");
		int no1 = sc.nextInt();
		System.out.println("Enter the number2 :");
		int no2 = sc.nextInt();
		System.out.println("Enter the number3 :");
		int no3 = sc.nextInt();
		System.out.println("Enter the number4 :");
		int no4 = sc.nextInt();
		System.out.println("Enter the number5 :");
		int no5 = sc.nextInt();
		
		if(no1>no2&&no1>no3&&no1>no4&&no1>no5)
		{
			System.out.println(" number1 is greater among all five "+no1);
		}
		else if(no2>no1&&no2>no3&&no2>no4&&no2>no5)
		{
			System.out.println(" number2 is greater among all five "+no2);
		}
		else if(no3>no1&&no3>no2&&no3>no4&&no3>no5)
		{
			System.out.println(" number3 is greater among all five "+no3);
		}
		else if(no4>no1&&no4>no2&&no4>no3&&no4>no5)
		{
			System.out.println(" number4 is greater among all five "+no4);
		}
		else if(no5>no1&&no5>no2&&no5>no4&&no3<no5)
		{
			System.out.println(" number5 is greater among all five "+no5);
		}

	}
}