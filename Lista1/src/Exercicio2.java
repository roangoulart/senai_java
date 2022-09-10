/* (Lista 2 - Exercício 1) Desenvolva um programa que pergunte qual é a maioridade
 * civil do seu “estado/país” e que posteriormente o usuário informe sua idade.
 * Como resultado, o programa deve informar se ele é ou não maior de idade.
 */

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maiorIdade = Integer.parseInt(JOptionPane.showInputDialog("Qual a maioridade do seu país? "));

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

		if (idade >= maiorIdade) {
			JOptionPane.showMessageDialog(null, "Você é maior de idade.", "Verificador de maioridade", JOptionPane.INFORMATION_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null, "Você é menor de idade.", "Verificador de maioridade", JOptionPane.INFORMATION_MESSAGE);

		}

	}

}
