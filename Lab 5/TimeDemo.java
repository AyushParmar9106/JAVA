class Time{
	int hour;
	int min;
	Time(){
		this.hour = 12;
		this.min = 30;
	}
	Time(int hour, int min){
		this.hour = hour;
		this.min = min;
	}
	void add(Time t){
		int h= this.hour + t.hour;
		int m= this.min + t.min;
		if(m>=60){
			h++;
			m=m-60;
		}
		System.out.println("hour="+h+"min="+m);
	}
}
public class TimeDemo{
	public static void main(String[] args){
		Time t1= new Time();
		Time t2= new Time(1,50);
		t1.add(t2);
	}
}
