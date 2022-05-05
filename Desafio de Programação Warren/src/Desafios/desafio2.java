package Desafios;

import javax.swing.JOptionPane;

public class desafio2 {

	public static void main(String[] args) {

		int minimo = 3;
		int alunos = 0;
		String[] tempoChegada = new String[5];
		int[] chegadaAluno = new int[5];

		for (int i = 0; i < 5; i++) {
			tempoChegada[i] = JOptionPane.showInputDialog("Em que horário chegou o aluno " + (i + 1) + "?");
			chegadaAluno[i] = Integer.parseInt(tempoChegada[i]);
		}

		for (int i = 0; i < chegadaAluno.length; i++) {
			if (chegadaAluno[i] <= 0) {
				alunos = alunos + 1;
				System.out.println("O aluno " + (i + 1) + " chegou a tempo, agora temos " + alunos + " alunos em sala");
			}
		}
		System.out.println((alunos >= minimo) ? "Aula Normal" : "Aula Cancelada");
	}

}
