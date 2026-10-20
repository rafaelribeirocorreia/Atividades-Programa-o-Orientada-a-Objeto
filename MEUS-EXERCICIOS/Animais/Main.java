import java.util.Scanner;
public class Main{
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Cachorro c = new Cachorro ("Fred", 14);
		Gato g = new Gato ("Gust", 12);
		
		c.exibirDados();
		g.exibirDados();
	}
}

