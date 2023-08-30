package semana_01;

public class Caja {
	public double largo_cm, ancho_cm, alto_cm, peso_balanza;
	
	public double volumenCaja() {
		return largo_cm*ancho_cm*alto_cm;
	}
	public double pesoVolumetrico() {
		return volumenCaja()/5000;
	}
	public double pesoFacturable() {
		if(pesoVolumetrico()>peso_balanza) {
			return pesoVolumetrico();
		}else {
			return peso_balanza;
		}
	}
}
