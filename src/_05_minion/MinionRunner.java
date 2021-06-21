package _05_minion;

public class MinionRunner {
	public static void main(String[] args) {
		Minion m = new  Minion("Bob", 2, "yellow", "master");
		
		m.setEyes(-10000000);
		
		System.out.println(m.getEyes());
	}
}
