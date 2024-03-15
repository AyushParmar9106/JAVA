import java.util.Scanner;
abstract class vegetable{
	String color;
	String Veginame;
abstract public String toString();
}
class Potato extends vegetable{
	Potato(String c){
		super.color=c;
		super.Veginame="potato";
	}
	public String toString(){
		return "color="+super.color+";veginame="+super.Veginame;
	}
}
class Tomato extends vegetable{
	Tomato(String c){
		super.color=c;
		super.Veginame="Tomato";
	}
	public String toString(){
		return "color="+super.color+";veginame="+super.Veginame;
	}
}
class Bringle extends vegetable{
	Bringle(String c){
		super.color=c;
		super.Veginame="Bringle";
	}
	public String toString(){
		return "color="+super.color+";veginame="+super.Veginame;
	}
}
public class Part_a{
	public static void main(String[] args){
		Potato p= new Potato("brown");
		System.out.println(p);
		Bringle p2= new Bringle("purple");
		System.out.println(p2);
		Tomato p1= new Tomato("red");
		System.out.println(p1);
	}
}
