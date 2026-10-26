package Day_4;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		person p=new person();
		p.detail();
		
		employee e=new employee();
		e.detail();
		
		manager m=new manager();
		m.detail();

	}

}
class person{
	String name="Prathibaa";
	int age=19;
	void detail(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class employee extends person{
	int id=22;
	int salary=100000;
	void detail(){
		System.out.println("Id: "+id);
		System.out.println("Salary: "+salary);
	
	}
}

class manager extends employee{
	String dep="IT";
	void detail(){
		System.out.println("Department: "+dep);
	}
}
