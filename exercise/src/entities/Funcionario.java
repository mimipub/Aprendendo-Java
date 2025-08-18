package entities;

public class Funcionario {
	public double grossSalary, tax;
	public String nome;
		
	public double NetSalary(){
		 return grossSalary - tax;
	}
	public void IncreseSalary(double percentage ) {
		grossSalary += grossSalary * percentage / 100;
	}
	public String toString(){
		return nome
			+ ", $ "
			+ String.format("%.2f ", NetSalary());
	}
}
