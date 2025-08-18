package entities;

public class media {
	public double a;
	public double b;
	public double c;
	public String nome;
	
	public double calcularMediana() {
		return a+b+c;
	}
	
	public double resto() {
		if (calcularMediana() < 60) {
			return 60 - calcularMediana();
		}else {
			return 0.0;
		}
	}
	
}
