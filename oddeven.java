import java.util.Scanner;
class OddEven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		 int num = sc.nextInt();
		System.out.println(num%2==0);
		System.out.println((num/2)==(num/2.0));
		System.out.println((num/2)==num);
	
		
	}
		 
}
