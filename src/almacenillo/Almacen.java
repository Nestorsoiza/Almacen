package almacenillo;

public class Almacen {
	private Bebida[][] estanteria;

	public Almacen(int filas, int columnas) {
		estanteria = new Bebida[filas][columnas];
	}

	public Almacen() {
		estanteria = new Bebida[5][5];
	}

	public void agregarBebida(Bebida b) {
		boolean encontrado = false;
		for (int i = 0; i < estanteria.length && !encontrado; i++) {
			for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
				if (estanteria[i][j] == null) {
					estanteria[i][j] = b;
					encontrado = true;
				}
			}
		}
		if (encontrado) {
			System.out.println("Bebida añadida");
		}
		System.out.println("No se ha podido añadir la bebida");
	}

	public void eliminarBebida(int id) {

		boolean encontrado = false;
		for (int i = 0; i < estanteria.length && !encontrado; i++) {
			for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
				if (estanteria[i][j] != null) {
					if (estanteria[i][j].getId() == id) {
						estanteria[i][j] = null;
						encontrado = true;
					}
				}
			}
		}

		if (encontrado) {
			System.out.println("Bebida eliminada");
		} else {
			System.out.println("No existe la bebida");
		}

	}

	public void mostrarBebidas() {

		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) {
					System.out.println("fila " + i + ", columna: " + j + " Bebida: " + estanteria[i][j].toString());
				}
			}
		}

	}

	public double calcularPrecioBebidas(String string) {

		double precioTotal = 0;
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) {// controlo nulos
					precioTotal += estanteria[i][j].getPrecio();// acumulo el precio
				}
			}
		}

		return precioTotal;

	}

	public String calcularPrecioBebidas() {
		// TODO Auto-generated method stub
		return null;
	}

	public String calcularPrecioBebidas(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
