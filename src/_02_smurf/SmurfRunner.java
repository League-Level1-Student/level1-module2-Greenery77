package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		
		Smurf Handy = new Smurf("Handy");
		
		Handy.eat();

		String name = Handy.getName();
		
		System.out.println(name);
		
		Smurf Papa = new Smurf("Papa");
		
		String name1 = Papa.getName();
		
		String hatcolor = Papa.getHatColor();
		
		System.out.println(name1);
		
		System.out.println(hatcolor);
		
		Smurf Smurfette = new Smurf("Smurfette");
		
		String name2 = Smurfette.getName();
		
		String girlorboy = Smurfette.isGirlOrBoy();
		
		System.out.println(name2);
		
		System.out.println(girlorboy);
		
	}
	
}
