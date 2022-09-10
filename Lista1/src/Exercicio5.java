/* (Lista 4 - Exercício 4) Faça um algoritmo que mostre a soma de todos os
 * valores pares entre um intervalo de dois números digitados pelo usuário.
 * Exemplo 01.: início do intervalo: 1, final do intervalo: 8, logo, soma dos pares (2+4+6+8): 20
 * Exemplo 02.: início do intervalo: 2, final do intervalo: 12, logo, soma dos pares (2+4+6+8+10+12): 42
 * Não é necessário mostrar os números pares, apenas a soma deles.
 */

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de início do invertalo: "));
		int numFim = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final do intervalo: "));

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
		JOptionPane.showMessageDialog(null, somaPar, "Soma dos números pares: ", JOptionPane.INFORMATION_MESSAGE);
	}
}
