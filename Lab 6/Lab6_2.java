import java .util.Scanner;

class book{
	private String author_name;
	private String title;

	public book(String author_name,String title){
		this.author_name=author_name;
		this.title=title;
	}

	public void display(){
		System.out.println("author"+author_name);
		System.out.println("title"+title);
	} 

}
class book_publication extends book{
 public book_publication(String author_name,String title){
	super(author_name,title);
}
	public void display(){
		System.out.println("book_publication");
		super.display();
		
	} 
 }
	
	

class paper_publication extends book{
	public paper_publication(String author_name,String title){
	super(author_name,title);
}
	public void display(){
		System.out.println("paper_publication");
		super.display();
		
	} 
}

public class Lab6_2{
	public static void main(String args[]){
	book b1= new book_publication(":ayush",":xyz");
	b1.display();	

	System.out.println("============================");

	book b2= new book_publication(":bala",":abc");
	b2.display();
	}
}