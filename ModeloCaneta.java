import java.util.Scanner;
public class ModeloCaneta{
	
	public static void main (String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Esferografica";
		c1.cor = "Azul";
		c1.ponta = 0.75f;
		c1.tampar();
		c1.carga = 100;
		c1.rabiscar();
		c1.stats();
	}
}

