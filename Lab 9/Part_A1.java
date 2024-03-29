import java.io.*;
import java.util.*;

class A implements Runnable{
	public void run(){
		try{
			for(int i=0;i<10;i++){
			if(i%2==0){
				System.out.println(i);
			}
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
			for(int i=0;i<10;i++){
			if(i%2!=0){
				System.out.println(i);
			}
			Thread.sleep(1000);
		}}
		catch(Exception e){
			System.out.println(e);
			}
		}
	}
public class Part_A1{
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		Thread t1= new Thread(a);
		Thread t2= new Thread(b);
		t1.start();
		t2.start();
	}
}