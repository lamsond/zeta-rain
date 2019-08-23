
public class Zeta{
	private static final int MAX = 100000000;
	private static final int arrSize = 5;
	
	private static double calcZeta(int n) {
		double z = 1;
		for(int i = 2; i < MAX; i++) {
			z += 1.0 / Math.pow(i, n);
		}
		return z;
	}
	
	public static void main(String[] args) {
		double[] zetas = new double[arrSize];
		for(int i = 2; i <= zetas.length + 1; i++){
			zetas[i-2] = calcZeta(i);
		}
		
		for(int i = 0; i < zetas.length; i++) {
			System.out.println(zetas[i]);
		}
	}
}