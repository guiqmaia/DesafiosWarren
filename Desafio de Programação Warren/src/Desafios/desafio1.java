package Desafios;

public class desafio1 {
	
	public static void main(String[] args) {
		
		int def;
		int newDef;
		int inv;

		for (def = 10; def < 1000000; def++) {
			newDef = def;
			inv = 0;

			while (newDef > 0) {
				inv = (inv * 10) + (newDef % 10);
				newDef = newDef / 10;
			}
			int soma = inv + def;
			if (soma % 2 != 0) {
				if (inv > def) { // Evita que sejam feitas operações com números inversos começados em 0 e também
									// números repetidos
					System.out.println(soma);
				}
			}
		}
	}
}
