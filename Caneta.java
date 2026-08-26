public class Caneta{
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampa;
	
	void stats(){
		System.out.println ("Modelo: "+this.modelo);
		System.out.println ("Cor: "+this.cor);
		System.out.println ("Carga: "+this.carga+"%");
		System.out.println ("Ponta: "+this.ponta);
		if (tampa){
			System.out.println ("Caneta tampada");
		}
		else{
			System.out.println ("Caneta Destampada");
		}
	}
		
	
	void rabiscar(){
		if (tampa)
		{
			System.out.println ("Não da pra rabuscar com tampa burro!");
		} else {
			System.out.println ("Rabiscando!");
		}
	}
	
	void tampar(){
		this.tampa = true;
	}
	
	void destampar(){
		this.tampa = false;
	}
}

