
public class Coffee {
int temperature;
	public static void main(String[] args) {
		Coffee coffee = new Coffee(27);
coffee.brew();
	}
Coffee(int temperature){
	
}
void brew(){
	temperature = 110;
System.out.println("The coffee is ready at " + temperature + " degrees");
}
}
