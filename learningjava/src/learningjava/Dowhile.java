package learningjava;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<10);
		
		int f = 1;
		int num=5;
		do {
			f=f*i;
			i++;
			
		}while(i<=num);
		System.out.println(f);

	}
	
	

}
