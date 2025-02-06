import java.util.Scanner;
class LargestNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the 1st number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = sc.nextInt();
		System.out.println("Enter the 3rd number:");
		int num3 = sc.nextInt();
		//              4<5
		int lar = (num1>num2)?((num1>num3)?(num1):(num3)):((num2>num3)?(num2):(num3));
		System.out.println("The largest number of "+num1+" , "+num2+" and "+num3+" is "+lar+".");
	}
}
