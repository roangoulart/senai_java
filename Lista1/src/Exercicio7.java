/* (Lista 6 - Exerc�cio 4) Fa�a uma solu��o que alimente um vetor com
 * 10 valores inteiros e tamb�m que solicite ao usu�rio a entrada de
 * dados de um valor inteiro qualquer. A solu��o dever� fazer uma
 * busca do valor, informado pelo usu�rio, no vetor e imprimir a
 * posi��o em que este foi encontrado ou se n�o foi encontrado.
 */

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] valores = new int[10];

		int posicao = 0;

		for (int i = 0; i < 10; i++) {

			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "� n�mero: "));

		}

		int busca = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser buscado: "));

		boolean verificador = false;

		for (int i = 0; i < 10; i++) {

			if (busca == valores[i]) {
				posicao = i;
				JOptionPane.showMessageDialog(null, "Posi��o que o valor foi encontrado: " + (posicao + 1),
						"Posi��o encontrada", JOptionPane.INFORMATION_MESSAGE);
				verificador = true;

			}
		}
		if (verificador == false) {
			JOptionPane.showMessageDialog(null, "Valor n�o encontrado.", "Aten��o", JOptionPane.WARNING_MESSAGE);

		}
	}

}
