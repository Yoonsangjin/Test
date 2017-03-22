import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		System.out.print("account1 balance:");
		Scanner input = new Scanner(System.in);
		float account1 = input.nextFloat();
		
		System.out.print("account2 balance:");
		float account2 = input.nextFloat();
		
		System.out.print("Enter withdrawl amount for account1:");
		float withdrawal1 = input.nextFloat();
		
		account1=account1-withdrawal1;
		if(account1<0)
		{
			account1=0;
			System.out.printf("Debit amount exceeded account balance");
		}
		if(account2<0)
		{
			account2=0;
			System.out.printf("Debit amount exceeded account balance");
		}
		System.out.printf("subtracting %2f from account1 balance\n",withdrawal1);
		System.out.printf("account1 balance: %f\n",account1);
		System.out.printf("account2 balance: %f\n",account2);
		System.out.print("Enter withdrawl amount for account2:");
		float withdrawal2 = input.nextFloat();
		account2=account2-withdrawal2;
		if(account1<0)
		{
			account1=0;
			System.out.printf("Debit amount exceeded account balance");
		}
		if(account2<0)
		{
			account2=0;
			System.out.printf("Debit amount exceeded account balance");
		}
		System.out.printf("subtracting %2f from account1 balance\n",withdrawal1);
		System.out.printf("account1 balance: %f\n",account1);
		System.out.printf("account2 balance: %f\n",account2);
	

	}

}

