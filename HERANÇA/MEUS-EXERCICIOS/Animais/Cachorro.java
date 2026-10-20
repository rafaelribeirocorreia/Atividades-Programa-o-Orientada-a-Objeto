public class Cachorro extends Animal{
		
	public Cachorro (String nome, int idade){
		super(nome, idade);
	}	
	
	public String  emitirSons (){
		return "Au, Au, Au ...";
	}
	
	public void exibirDados(){
		System.out.println ("Cachorro| Nome: "+getNome()+" | Idade: "+getIdade()+" | Faz: "+emitirSons());
	}
	
}

