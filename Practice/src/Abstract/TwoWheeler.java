package Abstract;

public abstract class TwoWheeler implements Vehical
{

	@Override
	
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("This is TwoWheeler driving having two wheels");
	}

	@Override
	public void palyMusic() {
		// TODO Auto-generated method stub
		System.out.println("This is TwoWheeler PalyMusic having two wheels");
	}

	@Override
	public void engineType() {
		// TODO Auto-generated method stub
		System.out.println("This is TwoWheeler enginetype having two wheels");
	}

	@Override
	public void fuelType() {
		// TODO Auto-generated method stub
		System.out.println("This is TwoWheeler fuelType having two wheels");
	}

	public abstract void vehicalBrand();

}
