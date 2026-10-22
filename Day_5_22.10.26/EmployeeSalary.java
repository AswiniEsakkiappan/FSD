package Day_5;

public class Finalword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
        s.display();
        s.bike();

        Demo d = new Demo();
        d.show();
	}

}
class Father {
    final int a = 10;

    final void bike() {
        System.out.println("Father's bike");
    }
}

class Son extends Father {
    void display() {
        System.out.println("Final variable: " + a);
    }
}

final class Demo {
    void show() {
        System.out.println("This is a final class");
    }
}


