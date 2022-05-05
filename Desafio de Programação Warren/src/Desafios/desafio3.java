package Desafios;

import javax.swing.JOptionPane;

public class desafio3 {

	public static void main(String[] args) {
		
		String n = JOptionPane.showInputDialog("Digite o valor de n");
		int n1 = Integer.parseInt(n);
		
		String[] v = new String[3];
		int[] v1 = new int[3];
		
		for (int i = 0; i < 3; i++) {
			v[i] = JOptionPane.showInputDialog("Digite o número" + (i + 1) + " da lista");
			v1[i] = Integer.parseInt(v[i]);
		}
		
		System.out.println("Valor de n é igual a " + n1);
		
		if (v1[0] + v1[1] + v1[2] == n1) {
			System.out.println("[ " + v1[0] + ", " + v1[1] + ", " + v1[2] + "]");
		}if (v1[0] + v1[0] + v1[1] == n1) {
			System.out.println("[ " + v1[0] + ", " + v1[1] + ", " + v1[2] + "]");
		}if (v1[0] + v1[1] + v1[1] == n1) {
			System.out.println("[ " + v1[0] + ", " + v1[1] + ", " + v1[1] + "]");
		}if (v1[0] + v1[2] + v1[2] == n1) {
			System.out.println("[ " + v1[0] + ", " + v1[2] + ", " + v1[2] + "]");
		}if (v1[1] + v1[1] + v1[2] == n1) {
			System.out.println("[ " + v1[1] + ", " + v1[1] + ", " + v1[2] + "]");
		}if (v1[1] + v1[2] + v1[2] == n1) {
			System.out.println("[ " + v1[1] + ", " + v1[2] + ", " + v1[2] + "]");
		}
		
	}
	
	
}
