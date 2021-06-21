package _05_minion;


public class TeaParty {
	
	public String welcome(String name, Boolean isWoman, Boolean isKnighted) {
		
		if (isKnighted == true && isWoman == false){
			
			return "Hello Sir " + name ;
					
		}
		
		else if (isKnighted == true && isWoman == true) {
			
			return "Hello Lady " + name ;
		
		}
	
		else if (isKnighted == false && isWoman == false) {
			
			return "Hello Mr. " + name ;
			
		}
		
		else {
			return "Hello Ms. " + name ;
			
		}
		
	}
	
}
