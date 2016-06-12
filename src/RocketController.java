
public class RocketController {

	public static void main(String[] args) {
		Rocket rocket = new Rocket("The Doge", 100);
		rocket.launch();
		rocket.refuel(100);
		System.out.println(rocket.canMakeIt(101));

	}

}
