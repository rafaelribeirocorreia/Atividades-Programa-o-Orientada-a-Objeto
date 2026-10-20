public class Gato extends Animal{
	
	public Gato (String nome, int idade){
		super (nome, idade);
	}
	
	public String  emitirSons (){
		return "Miau, Miau, Miauuu...";
	}
	
	public void exibirDados(){
		System.out.println ("Gato| Nome: "+getNome()+" | Idade: "+getIdade()+" | Faz: "+emitirSons());
	}
}

