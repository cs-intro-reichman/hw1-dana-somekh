public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]); // להבין איך ניתן להגביל ערכים מעל 0
		int a = (int) (Math.random() * limit);
		int b = (int) (Math.random() * limit);
		int c = (int) (Math.random() * limit);
		int maxAB = Math.max(a,b);
		int maxABC = Math.max(maxAB,c);
		int minAB = Math.min(a,b);
		int minABC = Math.min(minAB,c);
		int midABC = (a + b + c) - minABC - maxABC;
		System.out.println(minABC + " " + midABC + " " + maxABC);
		}
}
