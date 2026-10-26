package Day_4;
public class Polymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c= new Calculator();
		c.dis(10,20);
		c.dis(10, 20,30);
		c.dis(10, 0.20, 30);
		c.dis("Prathibaa");
	}

}
class Calculator{
	void dis(int a, int b){
		System.out.println(a+b);
	}
	void dis(int a, int b, int c){
		System.out.println(a+b+c);
	}
	void dis(int a, double b, int c){
		System.out.println(a+b+c);
	}
	void dis(String name){
		System.out.println(name);
	}
}
