import java.util.*;
public class Lab_2_3{
	public static void main(String[] arge){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int a=sc.nextInt();
		System.out.println("value of a is: "+a);
		System.out.println("enter a number: ");
		int b=sc.nextInt();
		System.out.println("enter a string: ");
		String c=sc.next();
		System.out.println(c);
		if(c.equals("+"))
		{
			System.out.println("ans = "+(a+b));	
		}
		else if(c.equals("-"))
		{
			System.out.println("ans = "+(a-b));	
		}
		else if(c.equals("*"))
		{
			System.out.println("ans = "+(a*b));	
		}
		else if(c.equals("/"))
		{
			System.out.println("ans = "+(a/b));	
		}
	}
}