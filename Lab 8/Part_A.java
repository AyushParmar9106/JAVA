class Multiplication{
	public void repetetiveMultiplication(int x,int y){
		int multiple = 0;
		for(int i=0;i<=y;i++){
			multiple=multiple*x;
		}
		System.out.println();
	}
}
public class Part_A{
	public static void main(String[] args){
		try{
			int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]);

            Multiplication m1=new Multiplication();
            m1.repetetiveMultiplication(x, y);
		}
		catch(Exception e){
			 e.printStackTrace();
		}
		System.out.println("Program End");
	}
}