package Day_5;

class Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Son s1 = new Son();
           s1.sonbike();
           Son s2 = new Son("ASU");
           s2.sonbike();
           
	}

}
class Father{
	String name ="ABCD";
	public void bike(){
		System.out.println("This is father class");
	}
	Father(){
		System.out.println("This is default  father constructor");
	}
	Father( String s){
		System.out.println("This is param Constructor"+s);
	}
}
class Son extends Father{
	
	public void sonbike(){
		super.bike();
		System.out.println("This is child class");
	}
	Son(){
		super();
		System.out.println("this is son def constructor");
		
	}
	Son( String s){
		super(s);
		System.out.println("This is para constructor of son class");
		
	}
	
}
