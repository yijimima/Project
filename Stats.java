
public class Stats {

	public static void main(String[] args) {
		int made = 0;
		int n = 50;
		for (int j = 0; j < 100; j++) {
			for (int i = 0; i < 50; i++) {
				if ((Math.random() * 5) < 4) {
					made++;
				}
			}
			n=n+50;
			System.out.println(made+"  "+n);
			System.out.println("Percentage Made = " + made / (n + 0.0));
		}
	}

}
