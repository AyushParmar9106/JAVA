import java.util.Scanner;
public class Lab3_2{
	public static void main(String[] arge){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int a=sc.nextInt();
		System.out.println("value of a is: "+a);
		System.out.println("enter a number: ");
		int b=sc.nextInt();
		System.out.println("value of a is: "+b);
		System.out.println("enter b number: ");
		int c=sc.nextInt();
		System.out.println("value of a is: "+c);
		System.out.println("enter c number: ");

		if(a>b){
			if(a>c){
				System.out.println("a is greater");	
			}
			else{
				System.out.println("c is greater");	
			}
		}
		else{
			if(b>c){
				System.out.println("b is greater");	
			}
			else{
				System.out.println("c is greater");	
			}
		}
	}
}