package Abstract;

public class Honda extends TwoWheeler implements FourwheelerBrandInterface
{

	//Same Method name - set Different Parameter
	
	@Override
	public void vehicalBrand() {
		// TODO Auto-generated method stub
		System.out.println("This is Honda Twowheeler");
		
	}

	@Override
	public void vehicalBrand(String a) {
		// TODO Auto-generated method stub
		System.out.println("This is Honda FourWheeler");
	}


}
