import java.util.Scanner;
class Complex{
	int real;
	int imaginary;
	 Complex(){
		this.real = 4;
		this.imaginary = 5;
	}
	Complex(int real,int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	void add(Complex t){
		int r= this.real + t.real;
		int i= this.imaginary+ t.imaginary;
		
		System.out.println("ans="+r+ "+"+i+"i");
	}
}
public class Complex_number{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter real no");
		int	real= sc.nextInt();
		System.out.println("enter imaginary no");
		int	imaginary= sc.nextInt();
		Complex t1= new Complex();
		Complex t2= new Complex(real,imaginary);
		t1.add(t2);
	}
}