
public class Rocket {
	String name;
	int fuel;
	Rocket(String name, int fuel){
	this.fuel = fuel;
	this.name = name;
	System.out.println("Constructing Rocket...");
	}
	void launch(){
	for(int Dylan = fuel; Dylan >= 0; Dylan-- ){
		
			System.out.println(Dylan);
		
	}
		System.out.println("THE ROCKET IS OUT OF FUEL, WE'RE ALL GONNA DIE");
	}
	void refuel(int fuel){
		this.fuel = fuel;
	}

	boolean canMakeIt( int distance){
		if(distance < fuel )
		return true;
		else{
			return false;
		}
		
	}
}

