package Day_3;


import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		Arithmetic a=new Arithmetic();
		a.add();
		a.sub();
		a.mul();
		a.modu();
		a.div();
	}

}
class Arithmetic{
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	public void add(){
		int add=a+b;
		System.out.println("Addition value is: "+add);
	}
	
	public void sub(){
		int sub=a-b;
		System.out.println("Addition value is: "+sub);
	}
	
	public void mul(){
		int mul=a*b;
		System.out.println("Addition value is: "+mul);
	}
	
	public void modu(){
		int modu=a%b;
		System.out.println("Addition value is: "+modu);
	}
	
	public void div(){
		int div=a/b;
		System.out.println("Addition value is: "+div);
	}
}
