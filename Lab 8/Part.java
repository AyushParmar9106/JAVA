import java.util.Scanner;
public class Part{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
			double c=1;
		
		try{
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			c=a/b;
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
		System.out.println(c);	
		}
	}
}