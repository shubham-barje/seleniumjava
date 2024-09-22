package learningjava;

public class BreakContinue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				System.out.println("skip the iteration");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("final statement");
	}

}
//break : break keyword is used to stop the iteration according to condition which we specified