import java.util.Scanner;
	public class Lab3_1{
	public static void main(String[] arge){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int a=sc.nextInt();
		System.out.println("value of a is: "+a);
		int temp,sum=0;
		temp=a;
		while(a>0 || a<0){
			int b=a%10;
			sum=sum*10+b;
			a=a/10;
		}
		if(temp==sum){
			System.out.println("number is pelindrom");
		}
		else{
			System.out.println("number is not pelindrom");
		}
	}
}