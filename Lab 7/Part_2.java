interface A{
	int a=10;
	void mA();
}
interface A1 extends A{
	int a1=12;
	void mA1();
}
interface A2 extends A1{
	int a2=13;
	void mA2();
}
interface A12 extends A1,A2{
	int a3=14;
	void mA3();
}
class B implements A12{
	public void mA(){
		System.out.println(a);
	}
	public void mA1(){
		System.out.println(a1);
	}
	public void mA2(){
		System.out.println(a2);
	}
	public void mA3(){
		System.out.println(a3);
	}
}
public class Part_2{
	public static void main(String[] args){
		B b=new B();
		b.mA();
		
		b.mA1();
		
		b.mA2();
	
		b.mA3();
	}
}