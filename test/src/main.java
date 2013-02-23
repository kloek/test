
public class main {

	private static double styrranta = 0.0125;
	private static double egenranta = 0.06;
	
	private static double handpenning = 0.050;
	private static double start = 75000;
	
	public static void main(String[] args) {
		
		double eget;
		double total;
		double lan;
		double pranta;
		double mranta;
		
		eget = start;
		lan = eget/handpenning - eget;
		total = eget + lan;
		

		System.out.println(""+eget + "\t\t\t" + lan);
		for(int manad = 1; manad < 48 ; manad++){

			lan = eget/handpenning - eget;
			total = eget + lan;
			
			pranta = total * egenranta;
			mranta = lan * styrranta;
			
			eget = eget + pranta - mranta;
			total = eget + lan;
			
			
			System.out.println(manad +": " +eget + "\t\t\t" + eget/6.3);
		}
	}
}
