package learningjava;

public class Nestedloop {

	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<=5 ;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println("the i: "+i +"the j:"+j);
				count++;
			}
			
		}
		System.out.print(count);
	}

}
