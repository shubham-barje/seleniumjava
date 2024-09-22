package learningjava;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] multiDimensionalArray = new int[2][3]; //2*3=6 
		multiDimensionalArray [0][0] = 2;
		multiDimensionalArray [0][1] = 3;
		multiDimensionalArray [0][2] = 5 ;
		multiDimensionalArray [1][0] = 6 ;
		multiDimensionalArray [1][1] = 8 ;
		multiDimensionalArray [1][2] = 9 ;
//		System.out.println(multiDimensionalArray[1][2]);
		
		int[][] mutiDimensionalArray1  = {{2,3,4},{5,8,9}}; 
//		System.out.println(multiDimensionalArray[1][2]);
		
		for(int i=0;i<mutiDimensionalArray1.length;i++) {
			for(int j=0;j<mutiDimensionalArray1[i].length;j++) {
				System.out.println(mutiDimensionalArray1[i][j]);
			}
		}
		
	}

}
