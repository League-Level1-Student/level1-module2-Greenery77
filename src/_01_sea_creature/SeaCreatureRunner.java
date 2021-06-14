package _01_sea_creature;

public class SeaCreatureRunner {

	
public static void main(String[] args) {
	
	SeaCreature Spongebob = new SeaCreature("spogob");
	
	Spongebob.eat();
	Spongebob.laugh();
	
	SeaCreature Squidward = new SeaCreature("sqdwr");
	
	SeaCreature Patrick = new SeaCreature("patrc");
	
	Squidward.eat();
	Squidward.laugh();
	Squidward.getName();
	
	Patrick.getName();
	Patrick.eat();
	Patrick.laugh();
	
}


}

