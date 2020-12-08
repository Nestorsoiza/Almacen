package almacenillo;

public class AlmacenApp {

	public static void main(String[] args) {
		Almacen a = new Almacen();
		Bebida b;

		for (int i = 0; i < 10; i++) {
			switch (i % 2) {
			case 0:
				b = new AguaMineral("manantial1", 1.5, 5, "bezoya");
				a.agregarBebida(b);
				break;
			case 1:
				b = new BebidasAzucaradas(0.2, 1.5, 10, "Coca Cola", true);
				a.agregarBebida(b);
				break;
			}
		}

		a.mostrarBebidas();
		System.out.println("precio de todas las bebidas" + a.calcularPrecioBebidas());
		
		a.eliminarBebida(4);
		a.mostrarBebidas();
		
		System.out.println("precio de todas las bebidas" + a.calcularPrecioBebidas());
		
		System.out.println("precio de todas las bebidas marca bzoya" + a.calcularPrecioBebidas("bezoya"));
		
		System.out.println("precio de columna 0" + a.calcularPrecioBebidas(0));
	}
	

}
