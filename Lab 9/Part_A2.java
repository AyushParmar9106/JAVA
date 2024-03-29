import java.io.*;
import java.util.*;

class A implements Runnable{
	public void run(){
		try{
			for(;;){
			
				System.out.println("GOOD MOrning");
			
			Thread.sleep(1000);
		}}
		catch(Exception e){
			System.out.println(e);
			}
		}
	
}
class B implements Runnable{
	public void run(){
		try{
			for(;;){
			
				System.out.println("GOOD Afternoon");
			
			Thread.sleep(3000);
		}}
		catch(Exception e){
			System.out.println(e);
			}
		}
	
}
public class Part_A2{
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		Thread t1= new Thread(a);
		Thread t2= new Thread(b);
		t1.start();
		t2.start();
	}
}