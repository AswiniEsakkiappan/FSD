package Day_4;
public class BankAccount {

	public static void main(String[] args) {
		saving s=new saving();
		s.num=101;
		s.balance=50000;
		s.show();
		System.out.println();
		
		current c=new current();
		c.num=102;
		c.balance=2000;
		c.show();
		
	}

}
class bank{
	int num;
	int balance;
	void display(){
		System.out.println("Account number: "+num);
		System.out.println("Balance: "+balance);
	}
}
class saving extends bank{
	void show(){
		System.out.println("Savings Amount");
		display();
	}
}
class current extends bank{
	void show(){
		System.out.println("Current Amount");
		display();
	}
}
