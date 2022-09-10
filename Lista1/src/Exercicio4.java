/* (Lista 4 - Exercício 2) Faça um algoritmo que peça ao usuário 10 números
 * e mostre posteriormente quantos são pares e a soma deles, bem como quantos
 * são ímpares e a soma deles.
 */

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[10];

		int somaPar = 0;

		int somaImpar = 0;

		int numImpar = 0;

		int numPar = 0;

		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número: "));

			if (numeros[i] % 2 == 1) {
				numImpar = numImpar + 1;
				somaImpar = somaImpar + numeros[i];

			} else {
				numPar = numPar + 1;
				somaPar = somaPar + numeros[i];
			}

		}
		JOptionPane.showInternalMessageDialog(null, numPar, "Quantidade de números pares: ",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, somaPar, "Soma dos pares: ", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, numImpar, "Quantidade de números ímpares", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, somaImpar, "Soma dos ímpares: ", JOptionPane.INFORMATION_MESSAGE);

	}

}
