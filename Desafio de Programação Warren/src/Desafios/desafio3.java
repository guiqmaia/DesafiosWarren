package Desafios;

public class desafio3 {

	public static void main(String[] args) {

		int n = 10;
		int[] v = new int[4];

		for (int i = 0; i < 3; i++) {
			v[i] = (i + 2);
			
			
			if (v[0] + v[1] + v[2] == 10) {
				System.out.println("O valor " + n + ", pode ser obitdo pela soma de:");
				System.out.println("[ " + v[0] + ", " + v[1] + ", " + v[2] + "]");
			}if (v[0] + v[1] + v[1] == 10) {
				System.out.println("O valor " + n + ", pode ser obitdo pela soma de:");
				System.out.println("[ " + v[0] + ", " + v[1] + ", " + v[1] + "]");
			}if (v[0] + v[2] + v[2] == 10) {
				System.out.println("O valor " + n + ", pode ser obitdo pela soma de:");
				System.out.println("[ " + v[0] + ", " + v[2] + ", " + v[2] + "]");
			}if (v[1] + v[1] + v[2] == 10) {
				System.out.println("O valor " + n + ", pode ser obitdo pela soma de:");
				System.out.println("[ " + v[1] + ", " + v[1] + ", " + v[2] + "]");
			}if (v[1] + v[2] + v[2] == 10) {
				System.out.println("O valor " + n + ", pode ser obitdo pela soma de:");
				System.out.println("[ " + v[1] + ", " + v[2] + ", " + v[2] + "]");
			}
			
		}
	}
}

