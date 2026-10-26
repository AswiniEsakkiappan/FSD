package Day_3;



public class ClassKing {
	int tot_fam_of_king=5;
	public void idea(){
		System.out.println("Planning for War");
	}

	public static void main(String[] args) {
		ClassKing war= new ClassKing();
		war.idea();
		
		Fam1 a=new Fam1();
		a.house();
		
		Fam2 b=new Fam2();
		b.hou();
		
	}

}

class Fam1{
	String idea="New House Plan";
	
	public void house(){
		System.out.println("Have to build new house");
	}
}

class Fam2{
	String idea="Buying Thar Car";
	
	public void hou(){
		System.out.println(idea);
	}
}
