package Desafios;

import javax.swing.JOptionPane;

public class desafio2 {

	public static void main(String[] args) {

		int minimo = 3;
		int alunos = 0;
		String[] tempoChegada = new String[5];
		int[] chegadaAluno = new int[5];

		tempoChegada[0] = JOptionPane.showInputDialog("Em que horário chegou o aluno 1?");
		chegadaAluno[0] = Integer.parseInt(tempoChegada[0]);
		tempoChegada[1] = JOptionPane.showInputDialog("Em que horário chegou o aluno 2?");
		chegadaAluno[1] = Integer.parseInt(tempoChegada[1]);
		tempoChegada[2] = JOptionPane.showInputDialog("Em que horário chegou o aluno 3?");
		chegadaAluno[2] = Integer.parseInt(tempoChegada[2]);
		tempoChegada[3] = JOptionPane.showInputDialog("Em que horário chegou o aluno 4?");
		chegadaAluno[2] = Integer.parseInt(tempoChegada[3]);
		tempoChegada[4] = JOptionPane.showInputDialog("Em que horário chegou o aluno 5?");
		chegadaAluno[4] = Integer.parseInt(tempoChegada[4]);

		for (int i = 0; i < chegadaAluno.length; i++) {
			if (chegadaAluno[i] <= 0) {
				alunos = alunos + 1;
				System.out.println("O aluno " + (i + 1)  + " chegou a tempo, agora temos " + alunos + " alunos em sala");
			}
		}
		System.out.println((alunos >= minimo)? "Aula Normal" : "Aula Cancelada");
	}

}
