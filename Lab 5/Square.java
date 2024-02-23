public class Square{
	public static void main(String[] args){
		Circle a=new Circle();
		a.area(2);
	}
}
class Circle
{
	void area(int l)
	{
		double area=l*l;
		System.out.println(area);
	}
}