import java.util.Scanner;
class SumOfOddEvenDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the four digit number");
		int num = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		int temp = 0;
		int rem = num%10;
		 temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		 num = num/10;
		 rem = num%10;
		 temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		 num = num/10;
		 rem = num%10;
		 temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		 num = num/10;
		 rem = num%10;
		 temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		 num = num/10;
		 rem = num%10;
		 System.out.println("Even Sum = "+ evenSum);
			  System.out.println(" Odd Sum = "+oddSum);
		 //1233
		
			

	}
}
