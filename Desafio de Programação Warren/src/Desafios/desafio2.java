package Desafios;

import javax.swing.JOptionPane;

public class desafio2 {

	public static void main(String[] args) {
		
		int minimo = 3;
		int alunos = 0;
		String[] tempoChegada = new String[5];

		//Solução com Inputs
		
		tempoChegada[0] = JOptionPane.showInputDialog("Em que horário chegou o aluno 1?");
		double chegadaAluno1 = Double.parseDouble(tempoChegada[0]);
		tempoChegada[1] = JOptionPane.showInputDialog("Em que horário chegou o aluno 2?");
		double chegadaAluno2 = Double.parseDouble(tempoChegada[1]);
		tempoChegada[2] = JOptionPane.showInputDialog("Em que horário chegou o aluno 3?");
		double chegadaAluno3 = Double.parseDouble(tempoChegada[2]);
		tempoChegada[3] = JOptionPane.showInputDialog("Em que horário chegou o aluno 4?");
		double chegadaAluno4 = Double.parseDouble(tempoChegada[3]);
		tempoChegada[4] = JOptionPane.showInputDialog("Em que horário chegou o aluno 5?");
		double chegadaAluno5 = Double.parseDouble(tempoChegada[4]);

		if (chegadaAluno1 <= 0) {
			alunos = alunos+1;
			System.out.println("Aluno 1 chegou a tempo, agora temos " + alunos + " alunos em sala");			
		}if (chegadaAluno2 <= 0) {
			alunos = alunos+1;
			System.out.println("Aluno 2 chegou a tempo, agora temos " + alunos + " alunos em sala");			
		}if (chegadaAluno3 <= 0) {
			alunos = alunos+1;
			System.out.println("Aluno 3 chegou a tempo, agora temos " + alunos + " alunos em sala");			
		}if (chegadaAluno4 <= 0) {
			alunos = alunos+1;
			System.out.println("Aluno 4 chegou a tempo, agora temos " + alunos + " alunos em sala");			
		}if (chegadaAluno5 <= 0) {
			alunos = alunos+1;
			System.out.println("Aluno 5 chegou a tempo, agora temos " + alunos + " alunos em sala");			
		}if (alunos >= minimo) {
			System.out.println("Aula Normal");
		}else {System.out.println("Aula Cancelada por falta de alunos");}

	}

}
