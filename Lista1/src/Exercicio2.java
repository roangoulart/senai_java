/* (Lista 2 - Exerc�cio 1) Desenvolva um programa que pergunte qual � a maioridade
 * civil do seu �estado/pa�s� e que posteriormente o usu�rio informe sua idade.
 * Como resultado, o programa deve informar se ele � ou n�o maior de idade.
 */

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maiorIdade = Integer.parseInt(JOptionPane.showInputDialog("Qual a maioridade do seu pa�s? "));

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

		if (idade >= maiorIdade) {
			JOptionPane.showMessageDialog(null, "Voc� � maior de idade.", "Verificador de maioridade", JOptionPane.INFORMATION_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null, "Voc� � menor de idade.", "Verificador de maioridade", JOptionPane.INFORMATION_MESSAGE);

		}

	}

}
