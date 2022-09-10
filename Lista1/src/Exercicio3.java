/* (Lista 2 - Exercício 9) Faça um programa que peça ao usuário para informar 03
 * números e mostre o menor entre eles. Considere que o usuário não poderá informar
 * números iguais.
 */

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numero = new int[3];

		for (int i = 0; i < 3; i++) {

			numero[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite 3 números diferentes!" + "\n Digite o " + (i + 1) + "º número"));

			switch (i) {
			case 0:

				break;

			case 1:
				while (numero[1] == numero[0]) {
					JOptionPane.showMessageDialog(null, "Seus números não podem se repetir!", "Atenção",
							JOptionPane.WARNING_MESSAGE);

					numero[i] = Integer
							.parseInt(JOptionPane.showInputDialog("Digite seu " + (i + 1) + "º número novamente."));
				}

				break;

			case 2:
				while ((numero[2] == numero[1]) || (numero[2] == numero[0])) {
					JOptionPane.showMessageDialog(null, "Seus números não podem se repetir!", "Atenção",
							JOptionPane.WARNING_MESSAGE);
					numero[i] = Integer
							.parseInt(JOptionPane.showInputDialog("Digite seu " + (i + 1) + "º número novamente."));

				}

				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida", "Atenção", JOptionPane.WARNING_MESSAGE);
			}
		}

		if ((numero[0] < numero[1]) && (numero[0] < numero[2])) {
			JOptionPane.showMessageDialog(null, "O número " + numero[0] + " é o menor.", "Menor número",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (numero[1] < numero[2]) {
			JOptionPane.showMessageDialog(null, "O número " + numero[1] + " é o menor.", "Menor número",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "O número " + numero[2] + " é o menor.", "Menor número",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
