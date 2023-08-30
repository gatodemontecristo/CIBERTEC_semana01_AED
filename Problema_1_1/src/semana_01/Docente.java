package semana_01;

public class Docente {
	public int codigo, horas;
	public String nombre;
	public double tarifa;

	public double sueldoBruto() {
		return horas * tarifa;
	}

	public double descuento() {
		double vSueldoBruto = sueldoBruto();
		if (vSueldoBruto < 4500) {
			return vSueldoBruto * 0.12;
		} else if (vSueldoBruto >= 4500 && vSueldoBruto < 6500) {
			return vSueldoBruto * 0.14;
		} else {
			return vSueldoBruto * 0.16;
		}
	}

	public double sueldNeto() {
		return sueldoBruto() - descuento();
	}
}
