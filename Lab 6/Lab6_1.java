import java.util.Scanner;
public class Lab6_1{
	public static void main(String args[]){
		Student s1= new Student();
		s1.getspi();
	}
}
class Student{
	int id_no;
	int no_of_subject;
	String[] subject_code;
	int[] subject_credits;
	String[] subject_grade;
	double[] subject_gradepoint;

	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		id_no= sc.nextInt();
		System.out.println("enter no  subject : ");
		no_of_subject= sc.nextInt();
		subject_grade=new String[no_of_subject];
		subject_credits=new int[no_of_subject];
		subject_gradepoint=new double[no_of_subject];
		subject_code=new String[no_of_subject];

		for(int i=0;i<no_of_subject;i++){
			System.out.println("enter subject credit : ");
			subject_credits[i]=sc.nextInt();

			System.out.println("enter subject code");
			subject_code[i]=sc.next();

			System.out.println("enter subject grade : ");
			subject_grade[i]=sc.next();//A,B.C


			//bject_gradepoint[i]=sc.nextDouble();//10,9,8 //60,54,48 = sum

			//6,5,6 //17
			//spi=sum/17
		}

	}
	void getspi(){
		double subtotal =0.0;
		double credittotal=0.0;
		for(int i=0;i<no_of_subject;i++){
			credittotal = credittotal+subject_credits[i];
			if(subject_grade[i].equals("A")){
				subtotal =subtotal+ (10 * subject_credits[i]);
			}
			else if(subject_grade[i].equals("B")){
				subtotal =subtotal+( 9 * subject_credits[i]);
			}
			else if(subject_grade[i].equals("C")){
				subtotal =subtotal+( 8 * subject_credits[i]);
			}
			else if(subject_grade[i].equals("D")){
				subtotal =subtotal+( 7* subject_credits[i]);
			}
			else if(subject_grade[i].equals("E")){
				subtotal =subtotal+( 6 * subject_credits[i]);
			}
		}
		double spi=subtotal/credittotal;
		System.out.println("spi = "+spi);
	}
}