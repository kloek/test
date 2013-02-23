
public class fakultet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double res = 1;
		for(double i = 1; i < 171 ; i++){
			double tmp = res*i;
			res = tmp;
		}
		System.out.println(""+res);

	}

}
