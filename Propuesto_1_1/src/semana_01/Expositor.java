package semana_01;

public class Expositor {
	public int codigo,hora_trabajadas;
	public String nombre;
	public double tarifa_hora;
	
	public double sueldoBruto() {
		return hora_trabajadas*tarifa_hora;
	}
	public double descuentoAFP() {
		return 0.10 * sueldoBruto();
	}
	public double descuentoEPS() {
		return 0.05 * sueldoBruto();
	}
	public double sueldoNeto() {
		return sueldoBruto() - descuentoAFP() - descuentoEPS();
	}
}
