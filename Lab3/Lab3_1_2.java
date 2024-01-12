import java.util.Scanner;
public class Lab3_1_2{
	public static void main(String[] arge){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a string: ");
			String empty="";
			String str=sc.next();
		System.out.println("string is: "+str);

		for(int i=0;i<str.length();i++){
			char ch=str.charAt(str.length()-1-i);
			empty=empty+ch;
			}
			if(empty.equals(str)){
				System.out.println("string is palindrom");
			}
			else{
				System.out.println("string is not palindrom");
			}
		}
	}