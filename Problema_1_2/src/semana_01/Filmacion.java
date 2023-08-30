package semana_01;

public class Filmacion {
	public int codigo, duracion;
	public String titulo;
	public double precio;

	public double precioDolares() {
		return precio / 3.65;
	}
}
