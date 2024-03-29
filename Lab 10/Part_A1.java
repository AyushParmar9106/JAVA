import java.io.*;
public class Part_A1
{
	public static void main(String[] args)
	{      
		     String line;
			int readline=0;
			int Char=0;
			int word=0;
		try{
			
			FileReader fr = new FileReader("abc.txt");
			BufferedReader br = new BufferedReader(fr);
			while((line=br.readLine())!=null)
			{
				readline++;
				Char+=line.length();
				String[] w=line.split(" ");
				word+=w.length;

			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("no of line="+readline);
		System.out.println("no of character="+Char);
		System.out.println("no of word="+word);
	}
}