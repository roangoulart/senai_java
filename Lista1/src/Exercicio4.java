/* (Lista 4 - Exerc�cio 2) Fa�a um algoritmo que pe�a ao usu�rio 10 n�meros
 * e mostre posteriormente quantos s�o pares e a soma deles, bem como quantos
 * s�o �mpares e a soma deles.
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
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero: "));

			if (numeros[i] % 2 == 1) {
				numImpar = numImpar + 1;
				somaImpar = somaImpar + numeros[i];

			} else {
				numPar = numPar + 1;
				somaPar = somaPar + numeros[i];
			}

		}
		JOptionPane.showInternalMessageDialog(null, numPar, "Quantidade de n�meros pares: ",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, somaPar, "Soma dos pares: ", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, numImpar, "Quantidade de n�meros �mpares", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, somaImpar, "Soma dos �mpares: ", JOptionPane.INFORMATION_MESSAGE);

	}

}
