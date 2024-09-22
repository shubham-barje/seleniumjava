package learningjava;

public class stringLiteral_stringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Because of memory allocation this happens 
		String str1 = "Shubham";
		String str3 = "Shubham";
		String str2 = new String("Shubham");
		
		System.out.println(str1==str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		

	}

}
