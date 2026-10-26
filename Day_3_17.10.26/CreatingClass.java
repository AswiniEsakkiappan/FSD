package Day_3;
public class CreatingClass {

	public static void main(String[] args) {
		Prathi a=new Prathi();
		a.add();
		a.sub();
		a.mult();
		a.div();
		Bala b=new Bala();
		b.add();
		b.sub();
		b.mult();
		b.div();
	}

}

class Prathi{
	int learn_exp=356;
	String location="Thoothukudi";
	public void add(){
		System.out.println(learn_exp+100);
	}
	public void sub(){
		System.out.println(learn_exp-100);
	}
	public void mult(){
		System.out.println(learn_exp*100);
	}
	public void div(){
		System.out.println(learn_exp/100);
	}
}

class Bala{
	int work_exp=493;
	String location="Coimbatore";
	public void add(){
		System.out.println(work_exp+100);
	}
	public void sub(){
		System.out.println(work_exp-100);
	}
	public void mult(){
		System.out.println(work_exp*100);
	}
	public void div(){
		System.out.println(work_exp/100);
	}
}
