package semana_01;

public class Trabajador {
	 public int codigo, hor_trabajadas;
	 public double tarifa_hor;
	 public String nombre;
	 
	 public double sueldo() {
		 return hor_trabajadas*tarifa_hor;
	 }
}
