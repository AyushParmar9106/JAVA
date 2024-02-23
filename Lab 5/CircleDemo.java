public class CircleDemo{
	public static void main(String[] args){
		Circle c=new Circle();
		c.area(2);
	}
}
class Circle{
	void area(int r)
	{
		double area=3.1415*r*r;
		System.out.println(area);
	}
}