public class Aluno{
	public String nome;
	public double notaUm;
	public double notaDois;
	public double media;
	public String resultado;
	
	public void resultado(){
		System.out.println ("Nome: "+nome);
		media = (notaUm + notaDois) / 2;
		if (media > 6){
			System.out.println ("Aluno passou");
		}
		if (media < 5){
			System.out.println ("Aluno esta reprovado");
		}
		if (media == 6){
			System.out.println ("Aluno esta na media");
		}
	} 
}

