/* (Lista 4 - Exerc�cio 4) Fa�a um algoritmo que mostre a soma de todos os
 * valores pares entre um intervalo de dois n�meros digitados pelo usu�rio.
 * Exemplo 01.: in�cio do intervalo: 1, final do intervalo: 8, logo, soma dos pares (2+4+6+8): 20
 * Exemplo 02.: in�cio do intervalo: 2, final do intervalo: 12, logo, soma dos pares (2+4+6+8+10+12): 42
 * N�o � necess�rio mostrar os n�meros pares, apenas a soma deles.
 */

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de in�cio do invertalo: "));
		int numFim = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero final do intervalo: "));

		int vazio = 0;

		int somaPar = 0;

		if (numInicio > numFim) {
			vazio = numFim;
			numFim = numInicio;
			numInicio = vazio;
		}
		for (int i = numInicio; i <= numFim; i++) {
			if (i % 2 == 0) {
				somaPar = somaPar + i;

			}
		}
		JOptionPane.showMessageDialog(null, somaPar, "Soma dos n�meros pares: ", JOptionPane.INFORMATION_MESSAGE);
	}
}
