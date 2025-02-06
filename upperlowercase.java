import java.util.Scanner;
class UpperLowerCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		char value = sc.next().charAt(0);
		String ans = ((value >= 65 && value <= 90) || (value >= 96 && value<=122))?
			((value >= 65 && value <=90 )?("Its a Upper case"):("its Lower case")):((value >= '0' && value <='9' )?("Its a digit"):("Its a symboll"));
			
			               //true     //true       //or    //true   //true
		System.out.println(ans);				   
						   
						   
	}
}
