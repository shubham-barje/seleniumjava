package learningjava;

public class ternaryOperator {
//v-9
	public static void main(String[] args) {
//		variable = (condition) ? TrueExpression : FalseExpression
		int a = 10;
		int b = 20;
		String num = (a<b) ? "greater b" : "greater a";
		System.out.println(num);

		int number = (a<b) ? 1 : 2;
		System.out.println(number);
		//datatype will change according to expression (TrueExpression : FalseExpression)
	}

}
