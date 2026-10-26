package Day_3;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter mark:");
		int mark=sc.nextInt();
		Logical c=new Logical();
		
		c.eligible(age, mark);
		sc.close();
	}

}
class Logical{
	
	public void eligible(int age, int mark){
		if((age>=18)&&(mark>=50)){
			System.out.println("Eligible: "+"True");
		}
		else if((age>=18)||(mark<50)){
			System.out.println("Eligible: "+"False");
		}
		else if(!(age>=18)){
			System.out.println("Eligible in age: "+"False");
		}
		else{
			System.out.println("You have to wait "+age+" years and have to increase your mark more than 50");
		}
	}
}
