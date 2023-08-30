package semana_01;

public class Coordinador {
	public int codigo, categoria, celular;
	public String nombre;

	public double sueldo() {
		switch (categoria) {
		case 0:
			return 8500;
		case 1:
			return 6850;
		default:
			return 5500;
		}
	}
}
