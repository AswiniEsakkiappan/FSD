package Day_4;
public class SingleInheritance {

	public static void main(String[] args) {
		father f= new father();
		f.scooter();
		
		daughter d= new daughter();
		d.scooter();
		d.cycle();
	}

}
class father{
	int sbi=100000;
	void scooter(){
		System.out.println("Getting scooter from father class");
	}
}

class daughter extends father{
	int hdfc=1000;
	void cycle(){
		System.out.println("Cycle got from daughter class");
	}
}
