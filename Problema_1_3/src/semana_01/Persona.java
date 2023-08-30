package semana_01;

public class Persona {
	public String nombre, apellido;
	public int edad;
	public double estatura, peso;

	public String estado() {
//		if (edad < 18) {
//			return "Menor de edad";
//		} else {
//			return "Mayor de edad";
//		}
		return ((edad < 18) ? "Menor" : "Mayor" )+ " de edad";
	}

	public double imc() {
		// return peso / (estatura * estatura);
		return peso / Math.pow(estatura, 2);
	}
}
