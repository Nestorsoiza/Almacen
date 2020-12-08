package almacenillo;

public class AguaMineral extends Bebida {
	private String origen;

	public AguaMineral(double cantidad, double precio, String marca, String origen) {
		super(cantidad, precio, marca);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "AguaMineral con origen en " + origen + super.toString();
	}
	
	
}
