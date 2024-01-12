import java.util.Scanner;
public class Lab3_3{
	public static void main(String[] arge){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int a=sc.nextInt();
		System.out.println("value of a is: "+a);
		int count=0;
		for(int i=1;i<a;i++){
			if(a%i==0){
				count++;
			}
		}
		if(count==1){
			System.out.println("number is prime");
		}
		else{
			System.out.println("number is not prime");
		}
	}
}