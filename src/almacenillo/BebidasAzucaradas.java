package almacenillo;

public class BebidasAzucaradas extends Bebida {
	private double porcentajeAzucar;
	private boolean promocion;
	
	public BebidasAzucaradas(double cantidad, double precio, String marca, double porcentajeAzucar,
			boolean promocion) {
		super(cantidad, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
	}

	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	@Override
	public double getPrecio() {
		double precioDescuento = 0; 
		if (isPromocion()) {
		 precioDescuento += getPrecio() * 0.9;
		}
		return super.getPrecio();
	}

	@Override
	public String toString() {
		return super.toString() + " BebidasAzucaradas [porcentajeAzucar= " + porcentajeAzucar + ", promocion= " + promocion 
				+ ", toString()= " +  "]";
	}

	
}
