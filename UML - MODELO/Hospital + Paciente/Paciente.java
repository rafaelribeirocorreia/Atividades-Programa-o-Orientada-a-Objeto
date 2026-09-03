public class Paciente{
	public String paciente;
	public String sexo;
	public double peso;
	public double altura;
	public double imc;
	
	public void pessoa(){
		System.out.println ("Nome: "+paciente);
		System.out.println ("Sexo: "+sexo);
	}
	public void classificaçao(){
		imc = peso / (altura * altura);
	if (imc < 18.5){
		System.out.println ("Passa fome");
	}
	if (imc > 18.5 && imc < 24.9){
		System.out.println ("Peso normal");
	}
	if (imc > 25 && imc < 29.9){
		System.out.println ("Sobre peso");
	}
	if (imc > 30 && imc < 34.9){
		System.out.println ("Obsedade Grau I");
	}
	if (imc > 35 && imc < 39.9){
		System.out.println ("Obsidade Grau II");
	}
	if (imc > 40){
		System.out.println ("Onsidade Grau III");
	}
	}
}

