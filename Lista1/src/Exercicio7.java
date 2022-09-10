/* (Lista 6 - Exercício 4) Faça uma solução que alimente um vetor com
 * 10 valores inteiros e também que solicite ao usuário a entrada de
 * dados de um valor inteiro qualquer. A solução deverá fazer uma
 * busca do valor, informado pelo usuário, no vetor e imprimir a
 * posição em que este foi encontrado ou se não foi encontrado.
 */

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] valores = new int[10];

		int posicao = 0;

		for (int i = 0; i < 10; i++) {

			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número: "));

		}

		int busca = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser buscado: "));

		boolean verificador = false;

		for (int i = 0; i < 10; i++) {

			if (busca == valores[i]) {
				posicao = i;
				JOptionPane.showMessageDialog(null, "Posição que o valor foi encontrado: " + (posicao + 1),
						"Posição encontrada", JOptionPane.INFORMATION_MESSAGE);
				verificador = true;

			}
		}
		if (verificador == false) {
			JOptionPane.showMessageDialog(null, "Valor não encontrado.", "Atenção", JOptionPane.WARNING_MESSAGE);

		}
	}

}
