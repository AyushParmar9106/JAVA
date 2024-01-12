	import java.util.Scanner;
	public class Lab_3_1{
	public static void main(String[] arge){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int a=sc.nextInt();
		System.out.println("value of a is: "+a);
		System.out.println("enter a number: ");
		int b=sc.nextInt();
		System.out.println("value of a is: "+b);
		System.out.println("enter a number: ");
		int c=sc.nextInt();
		System.out.println("value of a is: "+c);
		System.out.println("enter a number: ");
		int d=sc.nextInt();
		System.out.println("value of a is: "+d);
		System.out.println("enter a number: ");
		int e=sc.nextInt();
		System.out.println("value of a is: "+e);
		System.out.println("enter a number: ");
		double f=(a+b+c+d+e)/5.0;

		if(f>=60){
			System.out.println("first division");	
		}
		else if(59>=f && f>=50){
			System.out.println("second devision");	
		 	}
		 	else if(49>=f && f>=40){
			System.out.println("third devision");	
		 	}
		 	else if(f<40){
			System.out.println("fail");	
		 	}
		}
	}