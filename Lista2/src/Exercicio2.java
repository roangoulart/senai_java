/* Escreva um programa que receba quatro notas do aluno e as
 * insira em um vetor. Depois, calcule a média aritmética 
 * entre as quatro notas e mostre o "conceito" do aluno 
 * conforme as instruções:
 * 9.0 ou maior = Conceito A
 * entre 8.0 e 8.9 = Conceito B
 * entre 7.0 e 7.9 = Conceito C
 * menor que 7.0 = Conceito D
 */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat decimal = new DecimalFormat("0.00");

		double media = 0;

		double[] notas = new double[4];

		for (int i = 0; i < 4; i++) {

			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira sua " + (i + 1) + "º nota: "));

			while ((notas[i] < 0) || (notas[i] > 10)) {

				notas[i] = Double
						.parseDouble(JOptionPane.showInputDialog("Insira novamente sua " + (i + 1) + "º nota: "));

			}

			media = notas[i] + media;

		}

		media /= 4;

		if (media >= 9) {
			JOptionPane.showMessageDialog(null, "Sua média foi de " + decimal.format(media) + ", rebendo conceito A.",
					"Valor da média", JOptionPane.INFORMATION_MESSAGE);

		} else if ((media >= 8) && (media < 9)) {
			// ((media >= 8) && (media < 9)) {
			JOptionPane.showMessageDialog(null, "Sua média foi de " + decimal.format(media) + ", recebendo conceito B.",
					"Valor da média", JOptionPane.INFORMATION_MESSAGE);

		} else if ((media >= 7) && (media < 8)) {
			// if ((media >= 7) && (media < 8)) {
			JOptionPane.showMessageDialog(null, "Sua média foi de " + decimal.format(media) + ", recebendo conceito C.",
					"Valor da média", JOptionPane.INFORMATION_MESSAGE);

		} else {
			// if (media < 7) {
			JOptionPane.showMessageDialog(null, "Sua média foi de " + decimal.format(media) + ", recebendo conceito D.",
					"Valor da média", JOptionPane.INFORMATION_MESSAGE);

		}
	}

}
