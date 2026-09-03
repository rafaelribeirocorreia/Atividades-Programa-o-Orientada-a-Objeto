public class Funcionario{
	String nome;
	double horasTrabalhadas;
	double valorDaHora;
	double salarioFinal;
	
	public void status() {
		salarioFinal = horasTrabalhadas * valorDaHora;
		System.out.println ("Nome:"+nome);
		System.out.println ("Salario:"+salarioFinal);
	}
}

