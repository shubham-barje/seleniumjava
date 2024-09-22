package learningjava;

public class MethodsDemo {
	public static void main(String[] args) {
		MethodsDemo md = new MethodsDemo();
		md.doLogout();
		doLogin();
		System.out.println(md.addNumbers(3, 2));
		md.diffParameter("Shubh", 5, 30);
		
	}
//	static --> The static keyword in Java is used for memory management mainly. We can apply static keyword 
//				with variables, methods, blocks and nested classes. 
//				The static keyword belongs to the class than an instance of the class
//	public --> access modifier
//	void --> some datatype here otherwise it default void
//	static in method --> we access the method directly without using refrence variable like md
	public static void doLogin() {
		System.out.println("LogIn Sucessful");
	}
	public void doLogout() {
		System.out.println("Logout Sucessful");
	}
	public int addNumbers(int x,int y) {
		return x+y;
	}
	public void diffParameter(String s, int i, float f) {
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
	}
}
