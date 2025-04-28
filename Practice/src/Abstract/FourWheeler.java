package Abstract;

public abstract class FourWheeler implements Vehical
{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("This is FourWheeler drive having four wheels");
	}

	@Override
	public void palyMusic() {
		// TODO Auto-generated method stub
		System.out.println("This is FourWheeler playMusic with four wheels ");
	}

	@Override
	public void engineType() {
		// TODO Auto-generated method stub
		System.out.println("This is FourWheeler enginetype with four wheels");
	}

	@Override
	public void fuelType() {
		// TODO Auto-generated method stub
		System.out.println("This is FourWheeler fuelType with four wheels");
		
	}

	public abstract void vehicleBrand() ;

}
