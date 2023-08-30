package semana_01;

public class Equipo {
	public int codigo;
	public String color, marca;
	public double precio_dol;
	
	public double precioSoles() {
		return precio_dol * 3.65;
	}
	public double precioEuro() {
		return precio_dol / 1.20;
	}
}
