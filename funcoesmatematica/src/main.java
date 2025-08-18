
class main {

	public static void main(String[] args) {
	
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double t = -25;
		double a, b, c, d;
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de 3" + x +" = " + a);
		System.out.println("Raiz quadrada de 4" + y + " = " + b);
		System.out.println("Raiz quadrada de 25 = " + c);
		
		a = Math.pow(x, y);
		b = Math.pow(y, 2.0);
		c = Math.pow(z, 2.0);
		
		System.out.println(x + " elevado ao quadrado = " + a);
		System.out.println(y + " elevado ao quadrado = " + b);
		System.out.println(5 + " elevado ao quadrado = " + c);
		
		a = Math.abs(y);
		b = Math.abs(z);
		d = Math.abs(t);
		
		System.out.println("Valor absoluto de " + y + " = " + a);
		System.out.println("Valor Absoluto de " + z + " = " + b); 
		System.out.println("Valor Absoluto de " + t + " = " + d); 
	}

}
