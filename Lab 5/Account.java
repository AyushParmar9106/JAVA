import java.util.Scanner;
class Bank_Account{
	int account_no;
	String userName;
	String email;
	double account_balance;
	String account_type;
	
	void getAccountDetails(int account_no,double account_balance,String userName,String email,String account_type)
	{
		this.account_no=account_no;
		this.account_balance=account_balance;
		this.userName=userName;
		this.email=email;
		this.account_type=account_type;
	}
	void displayAccountDetails(){
		System.out.println("your account no="+account_no);
		System.out.println("your name="+userName);
		System.out.println("your email="+email);
		System.out.println("your balance="+account_balance);
		System.out.println("your account type="+account_type);
	}
	
	}
public class Account
{
	public static void main(String[] args) {
		int account_no=0;
	String userName="FDD";
	String email="FGD";
	int account_balance=56;
	String account_type="DTGF";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a account no");
		account_no= sc.nextInt();
		sc.nextLine();
		System.out.println("enter user name");
		userName= sc.nextLine();
		System.out.println("enter a email");
		email= sc.nextLine();
		System.out.println("enter account_balance");
		account_balance = sc.nextInt();
		sc.nextLine();
		System.out.println("enter account_type");
		account_type= sc.nextLine();


		Bank_Account b1= new Bank_Account();
		b1.getAccountDetails(account_no,account_balance,userName,email,account_type);
		b1.displayAccountDetails();
	}
}