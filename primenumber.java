import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nubmer:");
		int num = sc.nextInt();
		String cpnd = (num==2 || num==3 || num ==5)?(num + " is a prime number"):
			((num%2==0||num%3==0||num%5==0)?(num +" it is not prime number"):(num+" it is a prime number"));
		System.out.println(cpnd);
	}
}

//(num==2||num=3)?(num + "is prime number"):((num%2==0||num%3==0)?(num+" is not prime"):(num+" is prime"));