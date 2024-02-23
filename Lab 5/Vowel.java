import java.util.Scanner;
class Count_vowel{
	int a=0,e=0,i=0,o=0,u=0;
	void count(String str){
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j)=='a')
			{
				a++;
			}
			else if(str.charAt(j)=='e')
			{
				e++;
			}
			else if(str.charAt(j)=='i')
			{
				i++;
			}
			else if(str.charAt(j)=='o')
			{
				o++;
			}
			else if(str.charAt(j)=='u')
			{
				u++;
			}
		}
	}
}
public class Vowel{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
Count_vowel v = new Count_vowel();
		while(true){
			String str = sc.nextLine();
			if(str.equals("quit")){
				break;
			}
			else{
				
				v.count(str);

			}
		}
		System.out.println("a="+v.a);
		System.out.println("e="+v.e);
		System.out.println("i="+v.i);
		System.out.println("o="+v.o);
		System.out.println("u="+v.u);
	}
}