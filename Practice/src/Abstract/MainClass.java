package Abstract;


public class MainClass {
	
	public static void main(String[] args) {
		
		Vehical v= new Honda();
		v.drive();
		v.engineType();
		v.fuelType();
		v.palyMusic();
		
		Honda honda= new Honda();
		honda.vehicalBrand();
		honda.vehicalBrand("rtt");
		
	
	}

}
